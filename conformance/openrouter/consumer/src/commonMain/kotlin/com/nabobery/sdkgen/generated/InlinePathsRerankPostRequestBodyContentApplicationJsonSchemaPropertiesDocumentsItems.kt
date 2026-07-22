package com.nabobery.sdkgen.generated

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

public enum class InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsBranch {
  Branch1,
  InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1,
}

public sealed class InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsNoMatchException(
  message: String,
) : InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsDecodingException(message)

internal data class InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1,
      matchesInlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1).count { it }
}

/**
 * A document to rerank. Either a plain string, or a structured object with optional `text` and/or `image`.
 */
@Serializable(with = InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItems
  .Serializer::class)
public class InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItems internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
        .decodeFromJsonElement<String>(raw) else null }

  public val inlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1:
      InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1) json
          .decodeFromJsonElement<InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1>(raw) else null }

  public val matchedBranches:
      Set<InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsBranch>
    get() = buildSet {
      if (inspection
        .matchesBranch1) add(InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsBranch
          .Branch1)
      if (inspection
        .matchesInlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1) add(InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsBranch.InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItems {
      val inspection = inspectInlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItems(raw)
      if (inspection.matchCount == 0) {
        throw InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsNoMatchException("InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItems " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItems(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItems {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItems")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItems) {
      encoder
        .requireJsonEncoder("InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItems")
          .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItems(element: JsonElement): InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1 = element
    .isJsonDecodable<InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1>()
  return InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1 =
      matchesInlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1) add("InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1: " +
        "value does not match " +
        "InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
