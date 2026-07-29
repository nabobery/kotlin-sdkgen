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

public enum class InlineV1TopupsPostRequestFormMetadataX7aa3f56aBranch {
  Branch1,
  InlineV1TopupsPostRequestFormMetadataAnyOf2X21f5a0e5,
}

public sealed class InlineV1TopupsPostRequestFormMetadataX7aa3f56aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TopupsPostRequestFormMetadataX7aa3f56aNoMatchException(
  message: String,
) : InlineV1TopupsPostRequestFormMetadataX7aa3f56aDecodingException(message)

internal data class InlineV1TopupsPostRequestFormMetadataX7aa3f56aInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TopupsPostRequestFormMetadataAnyOf2X21f5a0e5: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TopupsPostRequestFormMetadataAnyOf2X21f5a0e5).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1topups/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/metadata
 */
@Serializable(with = InlineV1TopupsPostRequestFormMetadataX7aa3f56a.Serializer::class)
public class InlineV1TopupsPostRequestFormMetadataX7aa3f56a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TopupsPostRequestFormMetadataX7aa3f56aInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1TopupsPostRequestFormMetadataAnyOf2X21f5a0e5:
      InlineV1TopupsPostRequestFormMetadataAnyOf2X21f5a0e5? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TopupsPostRequestFormMetadataAnyOf2X21f5a0e5) json.decodeFromJsonElement<InlineV1TopupsPostRequestFormMetadataAnyOf2X21f5a0e5>(raw) else null }

  public val matchedBranches: Set<InlineV1TopupsPostRequestFormMetadataX7aa3f56aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TopupsPostRequestFormMetadataX7aa3f56aBranch.Branch1)
      if (inspection.matchesInlineV1TopupsPostRequestFormMetadataAnyOf2X21f5a0e5) add(InlineV1TopupsPostRequestFormMetadataX7aa3f56aBranch.InlineV1TopupsPostRequestFormMetadataAnyOf2X21f5a0e5)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TopupsPostRequestFormMetadataX7aa3f56a {
      val inspection = inspectInlineV1TopupsPostRequestFormMetadataX7aa3f56a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TopupsPostRequestFormMetadataX7aa3f56aNoMatchException("InlineV1TopupsPostRequestFormMetadataX7aa3f56a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TopupsPostRequestFormMetadataX7aa3f56a(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1TopupsPostRequestFormMetadataX7aa3f56a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TopupsPostRequestFormMetadataX7aa3f56a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TopupsPostRequestFormMetadataX7aa3f56a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TopupsPostRequestFormMetadataX7aa3f56a) {
      encoder.requireJsonEncoder("InlineV1TopupsPostRequestFormMetadataX7aa3f56a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TopupsPostRequestFormMetadataX7aa3f56a(element: JsonElement): InlineV1TopupsPostRequestFormMetadataX7aa3f56aInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1TopupsPostRequestFormMetadataAnyOf2X21f5a0e5 = element.isJsonDecodable<InlineV1TopupsPostRequestFormMetadataAnyOf2X21f5a0e5>()
  return InlineV1TopupsPostRequestFormMetadataX7aa3f56aInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TopupsPostRequestFormMetadataAnyOf2X21f5a0e5 = matchesInlineV1TopupsPostRequestFormMetadataAnyOf2X21f5a0e5,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1TopupsPostRequestFormMetadataAnyOf2X21f5a0e5) add("InlineV1TopupsPostRequestFormMetadataAnyOf2X21f5a0e5: value does not match InlineV1TopupsPostRequestFormMetadataAnyOf2X21f5a0e5")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
