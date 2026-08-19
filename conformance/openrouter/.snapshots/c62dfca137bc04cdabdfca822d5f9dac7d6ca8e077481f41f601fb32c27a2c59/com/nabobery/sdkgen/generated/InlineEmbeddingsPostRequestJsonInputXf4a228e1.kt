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

public enum class InlineEmbeddingsPostRequestJsonInputXf4a228e1Branch {
  Branch1,
  Branch2,
  Branch3,
  Branch4,
  Branch5,
}

public sealed class InlineEmbeddingsPostRequestJsonInputXf4a228e1DecodingException(
  message: String,
) : SerializationException(message)

public class InlineEmbeddingsPostRequestJsonInputXf4a228e1NoMatchException(
  message: String,
) : InlineEmbeddingsPostRequestJsonInputXf4a228e1DecodingException(message)

internal data class InlineEmbeddingsPostRequestJsonInputXf4a228e1Inspection(
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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1embeddings/post/requestBody/content/application~1json/schema/properties/input
 */
@Serializable(with = InlineEmbeddingsPostRequestJsonInputXf4a228e1.Serializer::class)
public class InlineEmbeddingsPostRequestJsonInputXf4a228e1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineEmbeddingsPostRequestJsonInputXf4a228e1Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val branch3: List<Double>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<List<Double>>(raw) else null }

  public val branch4: List<List<Double>>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch4) json.decodeFromJsonElement<List<List<Double>>>(raw) else null }

  public val branch5: List<InlineEmbeddingsPostRequestJsonInputAnyOf5ItemX7412c5a6>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch5) json.decodeFromJsonElement<List<InlineEmbeddingsPostRequestJsonInputAnyOf5ItemX7412c5a6>>(raw) else null }

  public val matchedBranches: Set<InlineEmbeddingsPostRequestJsonInputXf4a228e1Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineEmbeddingsPostRequestJsonInputXf4a228e1Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineEmbeddingsPostRequestJsonInputXf4a228e1Branch.Branch2)
      if (inspection.matchesBranch3) add(InlineEmbeddingsPostRequestJsonInputXf4a228e1Branch.Branch3)
      if (inspection.matchesBranch4) add(InlineEmbeddingsPostRequestJsonInputXf4a228e1Branch.Branch4)
      if (inspection.matchesBranch5) add(InlineEmbeddingsPostRequestJsonInputXf4a228e1Branch.Branch5)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineEmbeddingsPostRequestJsonInputXf4a228e1 {
      val inspection = inspectInlineEmbeddingsPostRequestJsonInputXf4a228e1(raw)
      if (inspection.matchCount == 0) {
        throw InlineEmbeddingsPostRequestJsonInputXf4a228e1NoMatchException("InlineEmbeddingsPostRequestJsonInputXf4a228e1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineEmbeddingsPostRequestJsonInputXf4a228e1(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineEmbeddingsPostRequestJsonInputXf4a228e1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEmbeddingsPostRequestJsonInputXf4a228e1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEmbeddingsPostRequestJsonInputXf4a228e1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineEmbeddingsPostRequestJsonInputXf4a228e1) {
      encoder.requireJsonEncoder("InlineEmbeddingsPostRequestJsonInputXf4a228e1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineEmbeddingsPostRequestJsonInputXf4a228e1(element: JsonElement): InlineEmbeddingsPostRequestJsonInputXf4a228e1Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesBranch3 = element.isJsonDecodable<List<Double>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesBranch4 = element.isJsonDecodable<List<List<Double>>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesBranch5 = element.isJsonDecodable<List<InlineEmbeddingsPostRequestJsonInputAnyOf5ItemX7412c5a6>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlineEmbeddingsPostRequestJsonInputXf4a228e1Inspection(
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
