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

public enum class InlinePaymentIntentLastPaymentErrorXae7d80faBranch {
  ApiErrors,
}

public sealed class InlinePaymentIntentLastPaymentErrorXae7d80faDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentLastPaymentErrorXae7d80faNoMatchException(
  message: String,
) : InlinePaymentIntentLastPaymentErrorXae7d80faDecodingException(message)

internal data class InlinePaymentIntentLastPaymentErrorXae7d80faInspection(
  public val matchesApiErrors: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesApiErrors).count { it }
}

/**
 * The payment error encountered in the previous PaymentIntent confirmation. It will be cleared if the PaymentIntent is
 * later updated for any reason.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent/properties/last_payment_error
 */
@Serializable(with = InlinePaymentIntentLastPaymentErrorXae7d80fa.Serializer::class)
public class InlinePaymentIntentLastPaymentErrorXae7d80fa internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentLastPaymentErrorXae7d80faInspection,
) {
  public val apiErrors: ApiErrorsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesApiErrors) json.decodeFromJsonElement<ApiErrorsView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentLastPaymentErrorXae7d80faBranch>
    get() = buildSet {
      if (inspection.matchesApiErrors) add(InlinePaymentIntentLastPaymentErrorXae7d80faBranch.ApiErrors)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentLastPaymentErrorXae7d80fa {
      val inspection = inspectInlinePaymentIntentLastPaymentErrorXae7d80fa(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentLastPaymentErrorXae7d80faNoMatchException("InlinePaymentIntentLastPaymentErrorXae7d80fa matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentLastPaymentErrorXae7d80fa(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentLastPaymentErrorXae7d80fa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentLastPaymentErrorXae7d80fa {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentLastPaymentErrorXae7d80fa")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentLastPaymentErrorXae7d80fa) {
      encoder.requireJsonEncoder("InlinePaymentIntentLastPaymentErrorXae7d80fa").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentLastPaymentErrorXae7d80fa(element: JsonElement): InlinePaymentIntentLastPaymentErrorXae7d80faInspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentLastPaymentErrorXae7d80faInspection(
    matchesApiErrors = false,
    failures = listOf("ApiErrors: expected JSON object"),
  )
  val matchesApiErrors = raw["type"] != null
  return InlinePaymentIntentLastPaymentErrorXae7d80faInspection(
    matchesApiErrors = matchesApiErrors,
    failures = buildList {
      if (!matchesApiErrors) add("ApiErrors: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
