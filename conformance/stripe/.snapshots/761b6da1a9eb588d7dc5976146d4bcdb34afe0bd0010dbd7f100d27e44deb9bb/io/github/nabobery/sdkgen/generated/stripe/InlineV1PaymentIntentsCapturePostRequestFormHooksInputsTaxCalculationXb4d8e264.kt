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

public enum class InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264Branch {
  Branch1,
  InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c,
}

public sealed class InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264NoMatchException(
  message: String,
) : InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264DecodingException(message)

internal data class InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/hooks/properties/inputs/properties/tax/properties/calculation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/hooks/properties/inputs/properties/tax/properties/calculation
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264.Serializer::class)
public class InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c:
      InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c) json.decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c) add(InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264Branch.InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264 {
      val inspection = inspectInlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264NoMatchException("InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264(element: JsonElement): InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c = element.isJsonDecodable<InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c>()
  return InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c = matchesInlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c) add("InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c: value does not match InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
