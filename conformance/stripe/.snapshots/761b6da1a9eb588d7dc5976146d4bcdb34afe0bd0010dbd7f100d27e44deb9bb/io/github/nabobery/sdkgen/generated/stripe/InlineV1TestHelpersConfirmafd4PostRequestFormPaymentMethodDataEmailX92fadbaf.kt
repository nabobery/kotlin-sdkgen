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

public enum class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbafBranch {
  Branch1,
  InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X80cba9d9,
}

public sealed class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbafDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbafNoMatchException(
  message: String,
) : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbafDecodingException(message)

internal data class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbafInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X80cba9d9:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X80cba9d9).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/email.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/email
 */
@Serializable(with = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbaf.Serializer::class)
public class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbaf internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbafInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X80cba9d9:
      InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X80cba9d9? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X80cba9d9) json.decodeFromJsonElement<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X80cba9d9>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbafBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbafBranch.Branch1)
      if (inspection.matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X80cba9d9) add(InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbafBranch.InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X80cba9d9)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbaf {
      val inspection = inspectInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbaf(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbafNoMatchException("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbaf matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbaf(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbaf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbaf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbaf")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbaf) {
      encoder.requireJsonEncoder("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbaf").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbaf(element: JsonElement): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbafInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X80cba9d9 = element.isJsonDecodable<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X80cba9d9>()
  return InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbafInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X80cba9d9 = matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X80cba9d9,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X80cba9d9) add("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X80cba9d9: value does not match InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X80cba9d9")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
