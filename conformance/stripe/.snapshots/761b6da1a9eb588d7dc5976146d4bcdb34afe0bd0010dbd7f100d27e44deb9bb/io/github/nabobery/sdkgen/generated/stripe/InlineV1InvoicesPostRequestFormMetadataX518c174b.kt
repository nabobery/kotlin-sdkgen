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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1InvoicesPostRequestFormMetadataX518c174bBranch {
  Branch1,
  InlineV1InvoicesPostRequestFormMetadataAnyOf2X9ceb1237,
}

public sealed class InlineV1InvoicesPostRequestFormMetadataX518c174bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormMetadataX518c174bNoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormMetadataX518c174bDecodingException(message)

internal data class InlineV1InvoicesPostRequestFormMetadataX518c174bInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormMetadataAnyOf2X9ceb1237: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesPostRequestFormMetadataAnyOf2X9ceb1237).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/metadata
 */
@Serializable(with = InlineV1InvoicesPostRequestFormMetadataX518c174b.Serializer::class)
public class InlineV1InvoicesPostRequestFormMetadataX518c174b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoicesPostRequestFormMetadataX518c174bInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1InvoicesPostRequestFormMetadataAnyOf2X9ceb1237:
      InlineV1InvoicesPostRequestFormMetadataAnyOf2X9ceb1237? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormMetadataAnyOf2X9ceb1237) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormMetadataAnyOf2X9ceb1237>(raw) else null }

  public val matchedBranches: Set<InlineV1InvoicesPostRequestFormMetadataX518c174bBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesPostRequestFormMetadataX518c174bBranch.Branch1)
      if (inspection.matchesInlineV1InvoicesPostRequestFormMetadataAnyOf2X9ceb1237) add(InlineV1InvoicesPostRequestFormMetadataX518c174bBranch.InlineV1InvoicesPostRequestFormMetadataAnyOf2X9ceb1237)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormMetadataX518c174b {
      val inspection = inspectInlineV1InvoicesPostRequestFormMetadataX518c174b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormMetadataX518c174bNoMatchException("InlineV1InvoicesPostRequestFormMetadataX518c174b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormMetadataX518c174b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormMetadataX518c174b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormMetadataX518c174b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormMetadataX518c174b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormMetadataX518c174b) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormMetadataX518c174b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormMetadataX518c174b(element: JsonElement): InlineV1InvoicesPostRequestFormMetadataX518c174bInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1InvoicesPostRequestFormMetadataAnyOf2X9ceb1237 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormMetadataAnyOf2X9ceb1237>()
  return InlineV1InvoicesPostRequestFormMetadataX518c174bInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesPostRequestFormMetadataAnyOf2X9ceb1237 = matchesInlineV1InvoicesPostRequestFormMetadataAnyOf2X9ceb1237,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1InvoicesPostRequestFormMetadataAnyOf2X9ceb1237) add("InlineV1InvoicesPostRequestFormMetadataAnyOf2X9ceb1237: value does not match InlineV1InvoicesPostRequestFormMetadataAnyOf2X9ceb1237")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
