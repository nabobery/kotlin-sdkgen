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

public enum class InlineTaxIdCustomerXabeb847cBranch {
  Branch1,
  Customer,
}

public sealed class InlineTaxIdCustomerXabeb847cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTaxIdCustomerXabeb847cNoMatchException(
  message: String,
) : InlineTaxIdCustomerXabeb847cDecodingException(message)

internal data class InlineTaxIdCustomerXabeb847cInspection(
  public val matchesBranch1: Boolean,
  public val matchesCustomer: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCustomer).count { it }
}

/**
 * ID of the customer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_id/properties/customer
 */
@Serializable(with = InlineTaxIdCustomerXabeb847c.Serializer::class)
public class InlineTaxIdCustomerXabeb847c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTaxIdCustomerXabeb847cInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val customer: Customer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomer) json.decodeFromJsonElement<Customer>(raw) else null }

  public val matchedBranches: Set<InlineTaxIdCustomerXabeb847cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineTaxIdCustomerXabeb847cBranch.Branch1)
      if (inspection.matchesCustomer) add(InlineTaxIdCustomerXabeb847cBranch.Customer)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTaxIdCustomerXabeb847c {
      val inspection = inspectInlineTaxIdCustomerXabeb847c(raw)
      if (inspection.matchCount == 0) {
        throw InlineTaxIdCustomerXabeb847cNoMatchException("InlineTaxIdCustomerXabeb847c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTaxIdCustomerXabeb847c(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineTaxIdCustomerXabeb847c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTaxIdCustomerXabeb847c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTaxIdCustomerXabeb847c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTaxIdCustomerXabeb847c) {
      encoder.requireJsonEncoder("InlineTaxIdCustomerXabeb847c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTaxIdCustomerXabeb847c(element: JsonElement): InlineTaxIdCustomerXabeb847cInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCustomer = element.isJsonDecodable<Customer>()
  return InlineTaxIdCustomerXabeb847cInspection(
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
