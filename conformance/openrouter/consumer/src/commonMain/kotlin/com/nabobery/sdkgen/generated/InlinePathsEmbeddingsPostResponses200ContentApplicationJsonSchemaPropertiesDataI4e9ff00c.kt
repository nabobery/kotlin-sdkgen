package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00cBranch {
  Branch1,
  Branch2,
}

public sealed class InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00cDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00cNoMatchException(
  message: String,
) : InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00cDecodingException(message)

internal data class InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00cInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Embedding vector as an array of floats or a base64 string
 */
@Serializable(with = InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00c
  .Serializer::class)
public class InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00cInspection,
) {
  public val branch1: List<Double>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
        .decodeFromJsonElement<List<Double>>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json
        .decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches:
      Set<InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00cBranch>
    get() = buildSet {
      if (inspection
        .matchesBranch1) add(InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00cBranch.Branch1)
      if (inspection
        .matchesBranch2) add(InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00cBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00c {
      val inspection =
        inspectInlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00c(raw)
      if (inspection.matchCount == 0) {
        throw InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00cNoMatchException("InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00c " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00c(raw, json,
        inspection)
    }
  }

  public object Serializer : KSerializer<InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00c {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00c) {
      encoder
        .requireJsonEncoder("InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00c")
          .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00c(element: JsonElement): InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00cInspection {
  val matchesBranch1 = element.isJsonDecodable<List<Double>>() && (element as? JsonArray)?.size?.let {
    it <= 2147483647 } == true
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00cInspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesBranch2) add("Branch2: value does not match String")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
