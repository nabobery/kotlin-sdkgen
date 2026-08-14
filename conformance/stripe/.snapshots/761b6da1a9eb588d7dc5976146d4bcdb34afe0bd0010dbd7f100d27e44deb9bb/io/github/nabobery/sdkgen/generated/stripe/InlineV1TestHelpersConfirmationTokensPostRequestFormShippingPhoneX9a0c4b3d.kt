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

public enum class InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3dBranch {
  Branch1,
  InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe,
}

public sealed class InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3dNoMatchException(
  message: String,
) : InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3dDecodingException(message)

internal data class InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3dInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/shipping/properties/phone.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/shipping/properties/phone
 */
@Serializable(with = InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3d.Serializer::class)
public class InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3dInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe:
      InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe) json.decodeFromJsonElement<InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3dBranch.Branch1)
      if (inspection.matchesInlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe) add(InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3dBranch.InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3d {
      val inspection = inspectInlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3dNoMatchException("InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3d) {
      encoder.requireJsonEncoder("InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3d(element: JsonElement): InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3dInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe = element.isJsonDecodable<InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe>()
  return InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3dInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe = matchesInlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe) add("InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe: value does not match InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
