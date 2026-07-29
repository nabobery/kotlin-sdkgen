package com.nabobery.sdkgen.generated.stripe

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

public enum class InlineSetupAttemptCustomerX4f3b3f84Branch {
  Branch1,
  Customer,
  DeletedCustomer,
}

public sealed class InlineSetupAttemptCustomerX4f3b3f84DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupAttemptCustomerX4f3b3f84NoMatchException(
  message: String,
) : InlineSetupAttemptCustomerX4f3b3f84DecodingException(message)

internal data class InlineSetupAttemptCustomerX4f3b3f84Inspection(
  public val matchesBranch1: Boolean,
  public val matchesCustomer: Boolean,
  public val matchesDeletedCustomer: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCustomer, matchesDeletedCustomer).count { it }
}

/**
 * The value of [customer](https://docs.stripe.com/api/setup_intents/object#setup_intent_object-customer) on the
 * SetupIntent at the time of this confirmation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_attempt/properties/customer
 */
@Serializable(with = InlineSetupAttemptCustomerX4f3b3f84.Serializer::class)
public class InlineSetupAttemptCustomerX4f3b3f84 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSetupAttemptCustomerX4f3b3f84Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val customer: Customer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomer) json.decodeFromJsonElement<Customer>(raw) else null }

  public val deletedCustomer: DeletedCustomer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedCustomer) json.decodeFromJsonElement<DeletedCustomer>(raw) else null }

  public val matchedBranches: Set<InlineSetupAttemptCustomerX4f3b3f84Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSetupAttemptCustomerX4f3b3f84Branch.Branch1)
      if (inspection.matchesCustomer) add(InlineSetupAttemptCustomerX4f3b3f84Branch.Customer)
      if (inspection.matchesDeletedCustomer) add(InlineSetupAttemptCustomerX4f3b3f84Branch.DeletedCustomer)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupAttemptCustomerX4f3b3f84 {
      val inspection = inspectInlineSetupAttemptCustomerX4f3b3f84(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupAttemptCustomerX4f3b3f84NoMatchException("InlineSetupAttemptCustomerX4f3b3f84 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupAttemptCustomerX4f3b3f84(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSetupAttemptCustomerX4f3b3f84> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupAttemptCustomerX4f3b3f84 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupAttemptCustomerX4f3b3f84")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupAttemptCustomerX4f3b3f84) {
      encoder.requireJsonEncoder("InlineSetupAttemptCustomerX4f3b3f84").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupAttemptCustomerX4f3b3f84(element: JsonElement): InlineSetupAttemptCustomerX4f3b3f84Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCustomer = element.isJsonDecodable<Customer>()
  val matchesDeletedCustomer = element.isJsonDecodable<DeletedCustomer>()
  return InlineSetupAttemptCustomerX4f3b3f84Inspection(
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
