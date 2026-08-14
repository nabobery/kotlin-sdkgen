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

public enum class InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06bBranch {
  Branch1,
  InlineV1TokensPostRequestFormAccountIndividualMetadataAnyOf2Xa647a648,
}

public sealed class InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06bNoMatchException(
  message: String,
) : InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06bDecodingException(message)

internal data class InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06bInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TokensPostRequestFormAccountIndividualMetadataAnyOf2Xa647a648: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TokensPostRequestFormAccountIndividualMetadataAnyOf2Xa647a648).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/individual/properties/metadata.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/individual/properties/metadata
 */
@Serializable(with = InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06b.Serializer::class)
public class InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06bInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1TokensPostRequestFormAccountIndividualMetadataAnyOf2Xa647a648:
      InlineV1TokensPostRequestFormAccountIndividualMetadataAnyOf2Xa647a648? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TokensPostRequestFormAccountIndividualMetadataAnyOf2Xa647a648) json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountIndividualMetadataAnyOf2Xa647a648>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06bBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06bBranch.Branch1)
      if (inspection.matchesInlineV1TokensPostRequestFormAccountIndividualMetadataAnyOf2Xa647a648) add(InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06bBranch.InlineV1TokensPostRequestFormAccountIndividualMetadataAnyOf2Xa647a648)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06b {
      val inspection = inspectInlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06bNoMatchException("InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06b) {
      encoder.requireJsonEncoder("InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06b(element: JsonElement): InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06bInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1TokensPostRequestFormAccountIndividualMetadataAnyOf2Xa647a648 = element.isJsonDecodable<InlineV1TokensPostRequestFormAccountIndividualMetadataAnyOf2Xa647a648>()
  return InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06bInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TokensPostRequestFormAccountIndividualMetadataAnyOf2Xa647a648 = matchesInlineV1TokensPostRequestFormAccountIndividualMetadataAnyOf2Xa647a648,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1TokensPostRequestFormAccountIndividualMetadataAnyOf2Xa647a648) add("InlineV1TokensPostRequestFormAccountIndividualMetadataAnyOf2Xa647a648: value does not match InlineV1TokensPostRequestFormAccountIndividualMetadataAnyOf2Xa647a648")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
