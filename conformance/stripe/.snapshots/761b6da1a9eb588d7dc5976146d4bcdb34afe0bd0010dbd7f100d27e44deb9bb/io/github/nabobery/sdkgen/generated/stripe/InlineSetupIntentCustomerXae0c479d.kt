package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineSetupIntentCustomerXae0c479dBranch {
  Branch1,
  Customer,
  DeletedCustomer,
}

public sealed class InlineSetupIntentCustomerXae0c479dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupIntentCustomerXae0c479dNoMatchException(
  message: String,
) : InlineSetupIntentCustomerXae0c479dDecodingException(message)

internal data class InlineSetupIntentCustomerXae0c479dInspection(
  public val matchesBranch1: Boolean,
  public val matchesCustomer: Boolean,
  public val matchesDeletedCustomer: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCustomer, matchesDeletedCustomer).count { it }
}

/**
 * ID of the Customer this SetupIntent belongs to, if one exists.
 *
 * If present, the SetupIntent's payment method will be attached to the Customer on successful setup. Payment methods
 * attached to other Customers cannot be used with this SetupIntent.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent/properties/customer
 */
@Serializable(with = InlineSetupIntentCustomerXae0c479d.Serializer::class)
public class InlineSetupIntentCustomerXae0c479d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSetupIntentCustomerXae0c479dInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val customer: Customer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomer) json.decodeFromJsonElement<Customer>(raw) else null }

  public val deletedCustomer: DeletedCustomer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedCustomer) json.decodeFromJsonElement<DeletedCustomer>(raw) else null }

  public val matchedBranches: Set<InlineSetupIntentCustomerXae0c479dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSetupIntentCustomerXae0c479dBranch.Branch1)
      if (inspection.matchesCustomer) add(InlineSetupIntentCustomerXae0c479dBranch.Customer)
      if (inspection.matchesDeletedCustomer) add(InlineSetupIntentCustomerXae0c479dBranch.DeletedCustomer)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupIntentCustomerXae0c479d {
      val inspection = inspectInlineSetupIntentCustomerXae0c479d(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupIntentCustomerXae0c479dNoMatchException("InlineSetupIntentCustomerXae0c479d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupIntentCustomerXae0c479d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSetupIntentCustomerXae0c479d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupIntentCustomerXae0c479d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentCustomerXae0c479d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentCustomerXae0c479d) {
      encoder.requireJsonEncoder("InlineSetupIntentCustomerXae0c479d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupIntentCustomerXae0c479d(element: JsonElement): InlineSetupIntentCustomerXae0c479dInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCustomer = element.isJsonDecodable<Customer>()
  val matchesDeletedCustomer = element.isJsonDecodable<DeletedCustomer>()
  return InlineSetupIntentCustomerXae0c479dInspection(
    matchesBranch1 = matchesBranch1,
    matchesCustomer = matchesCustomer,
    matchesDeletedCustomer = matchesDeletedCustomer,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesCustomer) add("Customer: value does not match Customer")
      if (!matchesDeletedCustomer) add("DeletedCustomer: value does not match DeletedCustomer")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
