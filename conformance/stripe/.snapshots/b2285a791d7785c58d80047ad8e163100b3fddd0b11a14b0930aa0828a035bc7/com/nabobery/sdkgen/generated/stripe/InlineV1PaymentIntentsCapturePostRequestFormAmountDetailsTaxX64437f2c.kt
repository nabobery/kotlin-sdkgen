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

public enum class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2cBranch {
  InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf1X7fe4fdc9,
  InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf2Xd3bc516c,
}

public sealed class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2cNoMatchException(
  message: String,
) : InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2cDecodingException(message)

internal data class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2cInspection(
  public val matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf1X7fe4fdc9:
      Boolean,
  public val matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf2Xd3bc516c:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf1X7fe4fdc9, matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf2Xd3bc516c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/tax.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/tax
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2c.Serializer::class)
public class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2cInspection,
) {
  public val inlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf1X7fe4fdc9:
      InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf1X7fe4fdc9? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf1X7fe4fdc9) json.decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf1X7fe4fdc9>(raw) else null }

  public val inlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf2Xd3bc516c:
      InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf2Xd3bc516c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf2Xd3bc516c) json.decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf2Xd3bc516c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2cBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf1X7fe4fdc9) add(InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2cBranch.InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf1X7fe4fdc9)
      if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf2Xd3bc516c) add(InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2cBranch.InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf2Xd3bc516c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2c {
      val inspection = inspectInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2cNoMatchException("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2c(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2c) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2c(element: JsonElement): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2cInspection {
  val matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf1X7fe4fdc9 = element.isJsonDecodable<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf1X7fe4fdc9>()
  val matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf2Xd3bc516c = element.isJsonDecodable<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf2Xd3bc516c>()
  return InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxX64437f2cInspection(
    matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf1X7fe4fdc9 = matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf1X7fe4fdc9,
    matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf2Xd3bc516c = matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf2Xd3bc516c,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf1X7fe4fdc9) add("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf1X7fe4fdc9: value does not match InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf1X7fe4fdc9")
      if (!matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf2Xd3bc516c) add("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf2Xd3bc516c: value does not match InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsTaxAnyOf2Xd3bc516c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
