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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X23174c80,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X23174c80:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X23174c80).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/swish.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/swish
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X23174c80:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X23174c80? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X23174c80) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X23174c80>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X23174c80) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X23174c80)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X23174c80 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X23174c80>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X23174c80 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X23174c80,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X23174c80) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X23174c80: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X23174c80")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
