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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743fBranch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9ec428b2,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743fNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743fDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743fInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9ec428b2:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9ec428b2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/interac_present.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/interac_present
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743f.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743fInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9ec428b2:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9ec428b2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9ec428b2) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9ec428b2>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743fBranch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9ec428b2) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743fBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9ec428b2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743f {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743fNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743f) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743f(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743fInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9ec428b2 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9ec428b2>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743fInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9ec428b2 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9ec428b2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9ec428b2) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9ec428b2: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9ec428b2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
