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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357abBranch {
  InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382,
  InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf2X1bcb1f76,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357abDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357abNoMatchException(
  message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357abDecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357abInspection(
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382:
      Boolean,
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf2X1bcb1f76:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382, matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf2X1bcb1f76).count { it }
}

/**
 * Provides industry-specific information about the amount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357ab.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357ab internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357abInspection,
) {
  public val inlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382>(raw) else null }

  public val inlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf2X1bcb1f76:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf2X1bcb1f76? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf2X1bcb1f76) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf2X1bcb1f76>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357abBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382) add(InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357abBranch.InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382)
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf2X1bcb1f76) add(InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357abBranch.InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf2X1bcb1f76)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357ab {
      val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357ab(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357abNoMatchException("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357ab matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357ab(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357ab> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357ab {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357ab")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357ab) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357ab").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357ab(element: JsonElement): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357abInspection {
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382 = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382>()
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf2X1bcb1f76 = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf2X1bcb1f76>()
  return InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357abInspection(
    matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382 = matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382,
    matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf2X1bcb1f76 = matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf2X1bcb1f76,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382) add("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382: value does not match InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382")
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf2X1bcb1f76) add("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf2X1bcb1f76: value does not match InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf2X1bcb1f76")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
