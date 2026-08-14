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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlinePaymentMethodSepaDebitGeneratedFromX94640171Branch {
  SepaDebitGeneratedFrom,
}

public sealed class InlinePaymentMethodSepaDebitGeneratedFromX94640171DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodSepaDebitGeneratedFromX94640171NoMatchException(
  message: String,
) : InlinePaymentMethodSepaDebitGeneratedFromX94640171DecodingException(message)

internal data class InlinePaymentMethodSepaDebitGeneratedFromX94640171Inspection(
  public val matchesSepaDebitGeneratedFrom: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSepaDebitGeneratedFrom).count { it }
}

/**
 * Information about the object that generated this PaymentMethod.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_sepa_debit/properties/generated_from
 */
@Serializable(with = InlinePaymentMethodSepaDebitGeneratedFromX94640171.Serializer::class)
public class InlinePaymentMethodSepaDebitGeneratedFromX94640171 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentMethodSepaDebitGeneratedFromX94640171Inspection,
) {
  public val sepaDebitGeneratedFrom: SepaDebitGeneratedFromView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSepaDebitGeneratedFrom) json.decodeFromJsonElement<SepaDebitGeneratedFromView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentMethodSepaDebitGeneratedFromX94640171Branch>
    get() = buildSet {
      if (inspection.matchesSepaDebitGeneratedFrom) add(InlinePaymentMethodSepaDebitGeneratedFromX94640171Branch.SepaDebitGeneratedFrom)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodSepaDebitGeneratedFromX94640171 {
      val inspection = inspectInlinePaymentMethodSepaDebitGeneratedFromX94640171(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodSepaDebitGeneratedFromX94640171NoMatchException("InlinePaymentMethodSepaDebitGeneratedFromX94640171 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodSepaDebitGeneratedFromX94640171(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodSepaDebitGeneratedFromX94640171> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodSepaDebitGeneratedFromX94640171 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodSepaDebitGeneratedFromX94640171")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodSepaDebitGeneratedFromX94640171) {
      encoder.requireJsonEncoder("InlinePaymentMethodSepaDebitGeneratedFromX94640171").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodSepaDebitGeneratedFromX94640171(element: JsonElement): InlinePaymentMethodSepaDebitGeneratedFromX94640171Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodSepaDebitGeneratedFromX94640171Inspection(
    matchesSepaDebitGeneratedFrom = false,
    failures = listOf("SepaDebitGeneratedFrom: expected JSON object"),
  )
  val matchesSepaDebitGeneratedFrom = true
  return InlinePaymentMethodSepaDebitGeneratedFromX94640171Inspection(
    matchesSepaDebitGeneratedFrom = matchesSepaDebitGeneratedFrom,
    failures = buildList {
      if (!matchesSepaDebitGeneratedFrom) add("SepaDebitGeneratedFrom: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
