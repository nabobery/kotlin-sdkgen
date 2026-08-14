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

public enum class InlineTaxIDsOwnerCustomerXa297aa4eBranch {
  Branch1,
  Customer,
}

public sealed class InlineTaxIDsOwnerCustomerXa297aa4eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTaxIDsOwnerCustomerXa297aa4eNoMatchException(
  message: String,
) : InlineTaxIDsOwnerCustomerXa297aa4eDecodingException(message)

internal data class InlineTaxIDsOwnerCustomerXa297aa4eInspection(
  public val matchesBranch1: Boolean,
  public val matchesCustomer: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCustomer).count { it }
}

/**
 * The customer being referenced when `type` is `customer`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_i_ds_owner/properties/customer
 */
@Serializable(with = InlineTaxIDsOwnerCustomerXa297aa4e.Serializer::class)
public class InlineTaxIDsOwnerCustomerXa297aa4e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTaxIDsOwnerCustomerXa297aa4eInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val customer: Customer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomer) json.decodeFromJsonElement<Customer>(raw) else null }

  public val matchedBranches: Set<InlineTaxIDsOwnerCustomerXa297aa4eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineTaxIDsOwnerCustomerXa297aa4eBranch.Branch1)
      if (inspection.matchesCustomer) add(InlineTaxIDsOwnerCustomerXa297aa4eBranch.Customer)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTaxIDsOwnerCustomerXa297aa4e {
      val inspection = inspectInlineTaxIDsOwnerCustomerXa297aa4e(raw)
      if (inspection.matchCount == 0) {
        throw InlineTaxIDsOwnerCustomerXa297aa4eNoMatchException("InlineTaxIDsOwnerCustomerXa297aa4e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTaxIDsOwnerCustomerXa297aa4e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTaxIDsOwnerCustomerXa297aa4e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTaxIDsOwnerCustomerXa297aa4e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTaxIDsOwnerCustomerXa297aa4e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTaxIDsOwnerCustomerXa297aa4e) {
      encoder.requireJsonEncoder("InlineTaxIDsOwnerCustomerXa297aa4e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTaxIDsOwnerCustomerXa297aa4e(element: JsonElement): InlineTaxIDsOwnerCustomerXa297aa4eInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCustomer = element.isJsonDecodable<Customer>()
  return InlineTaxIDsOwnerCustomerXa297aa4eInspection(
    matchesBranch1 = matchesBranch1,
    matchesCustomer = matchesCustomer,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesCustomer) add("Customer: value does not match Customer")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
