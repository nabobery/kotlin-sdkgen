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

public enum class InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputBranch {
  Branch1,
  Branch2,
  Branch3,
  Branch4,
  Branch5,
}

public sealed class InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputNoMatchException(
  message: String,
) : InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputDecodingException(message)

internal data class InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val matchesBranch4: Boolean,
  public val matchesBranch5: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3, matchesBranch4, matchesBranch5).count { it }
}

/**
 * Text, token, or multimodal input(s) to embed
 */
@Serializable(with = InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInput.Serializer::class)
public class InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInput internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
        .decodeFromJsonElement<String>(raw) else null }

  public val branch2: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json
        .decodeFromJsonElement<List<String>>(raw) else null }

  public val branch3: List<Double>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json
        .decodeFromJsonElement<List<Double>>(raw) else null }

  public val branch4: List<List<Double>>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch4) json
        .decodeFromJsonElement<List<List<Double>>>(raw) else null }

  public val branch5:
      List<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAnyOf4Items>?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch5) json
























































                                                                                                                        .decodeFromJsonElement<List<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAnyOf4Items>>(raw) else null }

  public val matchedBranches:
      Set<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputBranch>
    get() = buildSet {
      if (inspection
        .matchesBranch1) add(InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputBranch
          .Branch1)
      if (inspection
        .matchesBranch2) add(InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputBranch
          .Branch2)
      if (inspection
        .matchesBranch3) add(InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputBranch
          .Branch3)
      if (inspection
        .matchesBranch4) add(InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputBranch
          .Branch4)
      if (inspection
        .matchesBranch5) add(InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputBranch
          .Branch5)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInput {
      val inspection = inspectInlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInput(raw)
      if (inspection.matchCount == 0) {
        throw InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputNoMatchException("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInput " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInput(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInput> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInput {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInput")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInput) {
      encoder.requireJsonEncoder("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInput")
        .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInput(element: JsonElement): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let {
    it <= 2147483647 } == true
  val matchesBranch3 = element.isJsonDecodable<List<Double>>() && (element as? JsonArray)?.size?.let {
    it <= 2147483647 } == true
  val matchesBranch4 = element.isJsonDecodable<List<List<Double>>>() && (element as? JsonArray)?.size?.let {
    it <= 2147483647 } == true
  val matchesBranch5 = element


























































                                                                                                                        .isJsonDecodable<List<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAnyOf4Items>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputInspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    matchesBranch3 = matchesBranch3,
    matchesBranch4 = matchesBranch4,
    matchesBranch5 = matchesBranch5,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match List")
      if (!matchesBranch3) add("Branch3: value does not match List")
      if (!matchesBranch4) add("Branch4: value does not match List")
      if (!matchesBranch5) add("Branch5: value does not match List")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
