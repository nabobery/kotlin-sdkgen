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

public enum class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7dBranch {
  Branch1,
  InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4,
}

public sealed class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7dNoMatchException(
  message: String,
) : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7dDecodingException(message)

internal data class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7dInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/name.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/name
 */
@Serializable(with = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7d.Serializer::class)
public class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7dInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4:
      InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4) json.decodeFromJsonElement<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7dBranch.Branch1)
      if (inspection.matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4) add(InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7dBranch.InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7d {
      val inspection = inspectInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7dNoMatchException("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7d) {
      encoder.requireJsonEncoder("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7d(element: JsonElement): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7dInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4 = element.isJsonDecodable<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4>()
  return InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7dInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4 = matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4) add("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4: value does not match InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
