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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

@Serializable
public class InlineInvoicesPaymentMethodOptionsKonbiniX054be988Branch1View()

public enum class InlineInvoicesPaymentMethodOptionsKonbiniX054be988Branch {
  Branch1,
}

public sealed class InlineInvoicesPaymentMethodOptionsKonbiniX054be988DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoicesPaymentMethodOptionsKonbiniX054be988NoMatchException(
  message: String,
) : InlineInvoicesPaymentMethodOptionsKonbiniX054be988DecodingException(message)

internal data class InlineInvoicesPaymentMethodOptionsKonbiniX054be988Inspection(
  public val matchesBranch1: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1).count { it }
}

/**
 * If paying by `konbini`, this sub-hash contains details about the Konbini payment method options to pass to the
 * invoice’s PaymentIntent.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_payment_method_options/properties/konbini
 */
@Serializable(with = InlineInvoicesPaymentMethodOptionsKonbiniX054be988.Serializer::class)
public class InlineInvoicesPaymentMethodOptionsKonbiniX054be988 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoicesPaymentMethodOptionsKonbiniX054be988Inspection,
) {
  public val branch1: InlineInvoicesPaymentMethodOptionsKonbiniX054be988Branch1View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<InlineInvoicesPaymentMethodOptionsKonbiniX054be988Branch1View>(raw) else null }

  public val matchedBranches: Set<InlineInvoicesPaymentMethodOptionsKonbiniX054be988Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineInvoicesPaymentMethodOptionsKonbiniX054be988Branch.Branch1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoicesPaymentMethodOptionsKonbiniX054be988 {
      val inspection = inspectInlineInvoicesPaymentMethodOptionsKonbiniX054be988(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoicesPaymentMethodOptionsKonbiniX054be988NoMatchException("InlineInvoicesPaymentMethodOptionsKonbiniX054be988 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoicesPaymentMethodOptionsKonbiniX054be988(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineInvoicesPaymentMethodOptionsKonbiniX054be988> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoicesPaymentMethodOptionsKonbiniX054be988 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoicesPaymentMethodOptionsKonbiniX054be988")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoicesPaymentMethodOptionsKonbiniX054be988) {
      encoder.requireJsonEncoder("InlineInvoicesPaymentMethodOptionsKonbiniX054be988").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoicesPaymentMethodOptionsKonbiniX054be988(element: JsonElement): InlineInvoicesPaymentMethodOptionsKonbiniX054be988Inspection {
  val raw = element as? JsonObject ?: return InlineInvoicesPaymentMethodOptionsKonbiniX054be988Inspection(
    matchesBranch1 = false,
    failures = listOf("Branch1: expected JSON object"),
  )
  val matchesBranch1 = true
  return InlineInvoicesPaymentMethodOptionsKonbiniX054be988Inspection(
    matchesBranch1 = matchesBranch1,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
