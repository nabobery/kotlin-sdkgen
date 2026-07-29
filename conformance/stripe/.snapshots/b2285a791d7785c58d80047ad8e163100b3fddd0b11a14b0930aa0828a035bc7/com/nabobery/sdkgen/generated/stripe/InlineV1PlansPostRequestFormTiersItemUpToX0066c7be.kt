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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1PlansPostRequestFormTiersItemUpToX0066c7beBranch {
  InlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e,
  Branch2,
}

public sealed class InlineV1PlansPostRequestFormTiersItemUpToX0066c7beDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PlansPostRequestFormTiersItemUpToX0066c7beNoMatchException(
  message: String,
) : InlineV1PlansPostRequestFormTiersItemUpToX0066c7beDecodingException(message)

internal data class InlineV1PlansPostRequestFormTiersItemUpToX0066c7beInspection(
  public val matchesInlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1plans/post/requestBody/content/application~1x-www-form-urlencoded/schema/pr
 * operties/tiers/items/properties/up_to.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1plans/post/requestBody/content/application~1x-www-form-urlencoded/schema/pr
 * operties/tiers/items/properties/up_to
 */
@Serializable(with = InlineV1PlansPostRequestFormTiersItemUpToX0066c7be.Serializer::class)
public class InlineV1PlansPostRequestFormTiersItemUpToX0066c7be internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PlansPostRequestFormTiersItemUpToX0066c7beInspection,
) {
  public val inlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e:
      InlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e) json.decodeFromJsonElement<InlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1PlansPostRequestFormTiersItemUpToX0066c7beBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e) add(InlineV1PlansPostRequestFormTiersItemUpToX0066c7beBranch.InlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e)
      if (inspection.matchesBranch2) add(InlineV1PlansPostRequestFormTiersItemUpToX0066c7beBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PlansPostRequestFormTiersItemUpToX0066c7be {
      val inspection = inspectInlineV1PlansPostRequestFormTiersItemUpToX0066c7be(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PlansPostRequestFormTiersItemUpToX0066c7beNoMatchException("InlineV1PlansPostRequestFormTiersItemUpToX0066c7be matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PlansPostRequestFormTiersItemUpToX0066c7be(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PlansPostRequestFormTiersItemUpToX0066c7be> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PlansPostRequestFormTiersItemUpToX0066c7be {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PlansPostRequestFormTiersItemUpToX0066c7be")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PlansPostRequestFormTiersItemUpToX0066c7be) {
      encoder.requireJsonEncoder("InlineV1PlansPostRequestFormTiersItemUpToX0066c7be").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PlansPostRequestFormTiersItemUpToX0066c7be(element: JsonElement): InlineV1PlansPostRequestFormTiersItemUpToX0066c7beInspection {
  val matchesInlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e = element.isJsonDecodable<InlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1PlansPostRequestFormTiersItemUpToX0066c7beInspection(
    matchesInlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e = matchesInlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e) add("InlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e: value does not match InlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
