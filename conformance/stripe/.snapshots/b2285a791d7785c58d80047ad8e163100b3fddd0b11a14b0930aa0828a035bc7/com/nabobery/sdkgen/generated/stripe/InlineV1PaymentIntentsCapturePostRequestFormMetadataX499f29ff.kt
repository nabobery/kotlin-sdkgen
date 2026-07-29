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

public enum class InlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ffBranch {
  Branch1,
  InlineV1PaymentIntentsCapturePostRequestFormMetadataAnyOf2Xf119eacb,
}

public sealed class InlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ffDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ffNoMatchException(
  message: String,
) : InlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ffDecodingException(message)

internal data class InlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ffInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsCapturePostRequestFormMetadataAnyOf2Xf119eacb: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsCapturePostRequestFormMetadataAnyOf2Xf119eacb).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ff.Serializer::class)
public class InlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ff internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ffInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1PaymentIntentsCapturePostRequestFormMetadataAnyOf2Xf119eacb:
      InlineV1PaymentIntentsCapturePostRequestFormMetadataAnyOf2Xf119eacb? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormMetadataAnyOf2Xf119eacb) json.decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormMetadataAnyOf2Xf119eacb>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ffBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ffBranch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormMetadataAnyOf2Xf119eacb) add(InlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ffBranch.InlineV1PaymentIntentsCapturePostRequestFormMetadataAnyOf2Xf119eacb)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ff {
      val inspection = inspectInlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ff(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ffNoMatchException("InlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ff matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ff(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ff> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ff {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ff")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ff) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ff").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ff(element: JsonElement): InlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ffInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1PaymentIntentsCapturePostRequestFormMetadataAnyOf2Xf119eacb = element.isJsonDecodable<InlineV1PaymentIntentsCapturePostRequestFormMetadataAnyOf2Xf119eacb>()
  return InlineV1PaymentIntentsCapturePostRequestFormMetadataX499f29ffInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsCapturePostRequestFormMetadataAnyOf2Xf119eacb = matchesInlineV1PaymentIntentsCapturePostRequestFormMetadataAnyOf2Xf119eacb,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1PaymentIntentsCapturePostRequestFormMetadataAnyOf2Xf119eacb) add("InlineV1PaymentIntentsCapturePostRequestFormMetadataAnyOf2Xf119eacb: value does not match InlineV1PaymentIntentsCapturePostRequestFormMetadataAnyOf2Xf119eacb")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
