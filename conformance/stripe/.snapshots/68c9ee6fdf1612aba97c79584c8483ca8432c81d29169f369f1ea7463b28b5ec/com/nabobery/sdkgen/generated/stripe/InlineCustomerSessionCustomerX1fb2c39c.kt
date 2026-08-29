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

public enum class InlineCustomerSessionCustomerX1fb2c39cBranch {
  Branch1,
  Customer,
}

public sealed class InlineCustomerSessionCustomerX1fb2c39cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineCustomerSessionCustomerX1fb2c39cNoMatchException(
  message: String,
) : InlineCustomerSessionCustomerX1fb2c39cDecodingException(message)

internal data class InlineCustomerSessionCustomerX1fb2c39cInspection(
  public val matchesBranch1: Boolean,
  public val matchesCustomer: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCustomer).count { it }
}

/**
 * The Customer the Customer Session was created for.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_session/properties/customer
 */
@Serializable(with = InlineCustomerSessionCustomerX1fb2c39c.Serializer::class)
public class InlineCustomerSessionCustomerX1fb2c39c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCustomerSessionCustomerX1fb2c39cInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val customer: Customer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomer) json.decodeFromJsonElement<Customer>(raw) else null }

  public val matchedBranches: Set<InlineCustomerSessionCustomerX1fb2c39cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCustomerSessionCustomerX1fb2c39cBranch.Branch1)
      if (inspection.matchesCustomer) add(InlineCustomerSessionCustomerX1fb2c39cBranch.Customer)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCustomerSessionCustomerX1fb2c39c {
      val inspection = inspectInlineCustomerSessionCustomerX1fb2c39c(raw)
      if (inspection.matchCount == 0) {
        throw InlineCustomerSessionCustomerX1fb2c39cNoMatchException("InlineCustomerSessionCustomerX1fb2c39c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCustomerSessionCustomerX1fb2c39c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerSessionCustomerX1fb2c39c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomerSessionCustomerX1fb2c39c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerSessionCustomerX1fb2c39c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomerSessionCustomerX1fb2c39c) {
      encoder.requireJsonEncoder("InlineCustomerSessionCustomerX1fb2c39c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCustomerSessionCustomerX1fb2c39c(element: JsonElement): InlineCustomerSessionCustomerX1fb2c39cInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCustomer = element.isJsonDecodable<Customer>()
  return InlineCustomerSessionCustomerX1fb2c39cInspection(
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
