package io.github.nabobery.sdkgen.github.generated

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

public enum class InlineReposPagesPostRequestJsonXa2181708Branch {
  Branch1,
  Branch2,
}

public sealed class InlineReposPagesPostRequestJsonXa2181708DecodingException(
  message: String,
) : SerializationException(message)

public class InlineReposPagesPostRequestJsonXa2181708NoMatchException(
  message: String,
) : InlineReposPagesPostRequestJsonXa2181708DecodingException(message)

internal data class InlineReposPagesPostRequestJsonXa2181708Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * The source branch and directory used to publish your Pages site.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pages/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineReposPagesPostRequestJsonXa2181708.Serializer::class)
public class InlineReposPagesPostRequestJsonXa2181708 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineReposPagesPostRequestJsonXa2181708Inspection,
) {
  public val branch1: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val branch2: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val matchedBranches: Set<InlineReposPagesPostRequestJsonXa2181708Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineReposPagesPostRequestJsonXa2181708Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineReposPagesPostRequestJsonXa2181708Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineReposPagesPostRequestJsonXa2181708 {
      val inspection = inspectInlineReposPagesPostRequestJsonXa2181708(raw)
      if (inspection.matchCount == 0) {
        throw InlineReposPagesPostRequestJsonXa2181708NoMatchException("InlineReposPagesPostRequestJsonXa2181708 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineReposPagesPostRequestJsonXa2181708(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineReposPagesPostRequestJsonXa2181708> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPagesPostRequestJsonXa2181708 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPagesPostRequestJsonXa2181708")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPagesPostRequestJsonXa2181708) {
      encoder.requireJsonEncoder("InlineReposPagesPostRequestJsonXa2181708").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineReposPagesPostRequestJsonXa2181708(element: JsonElement): InlineReposPagesPostRequestJsonXa2181708Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonElement>()
  val matchesBranch2 = element.isJsonDecodable<JsonElement>()
  return InlineReposPagesPostRequestJsonXa2181708Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonElement")
      if (!matchesBranch2) add("Branch2: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
