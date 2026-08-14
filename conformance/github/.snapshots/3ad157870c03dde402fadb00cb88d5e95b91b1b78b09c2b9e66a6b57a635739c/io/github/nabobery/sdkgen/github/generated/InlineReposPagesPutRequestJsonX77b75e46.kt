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

public enum class InlineReposPagesPutRequestJsonX77b75e46Branch {
  Branch1,
  Branch2,
  Branch3,
  Branch4,
  Branch5,
}

public sealed class InlineReposPagesPutRequestJsonX77b75e46DecodingException(
  message: String,
) : SerializationException(message)

public class InlineReposPagesPutRequestJsonX77b75e46NoMatchException(
  message: String,
) : InlineReposPagesPutRequestJsonX77b75e46DecodingException(message)

internal data class InlineReposPagesPutRequestJsonX77b75e46Inspection(
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
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pages/put/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pages/put/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineReposPagesPutRequestJsonX77b75e46.Serializer::class)
public class InlineReposPagesPutRequestJsonX77b75e46 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineReposPagesPutRequestJsonX77b75e46Inspection,
) {
  public val branch1: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val branch2: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val branch4: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch4) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val branch5: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch5) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val matchedBranches: Set<InlineReposPagesPutRequestJsonX77b75e46Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineReposPagesPutRequestJsonX77b75e46Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineReposPagesPutRequestJsonX77b75e46Branch.Branch2)
      if (inspection.matchesBranch3) add(InlineReposPagesPutRequestJsonX77b75e46Branch.Branch3)
      if (inspection.matchesBranch4) add(InlineReposPagesPutRequestJsonX77b75e46Branch.Branch4)
      if (inspection.matchesBranch5) add(InlineReposPagesPutRequestJsonX77b75e46Branch.Branch5)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineReposPagesPutRequestJsonX77b75e46 {
      val inspection = inspectInlineReposPagesPutRequestJsonX77b75e46(raw)
      if (inspection.matchCount == 0) {
        throw InlineReposPagesPutRequestJsonX77b75e46NoMatchException("InlineReposPagesPutRequestJsonX77b75e46 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineReposPagesPutRequestJsonX77b75e46(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineReposPagesPutRequestJsonX77b75e46> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPagesPutRequestJsonX77b75e46 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPagesPutRequestJsonX77b75e46")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPagesPutRequestJsonX77b75e46) {
      encoder.requireJsonEncoder("InlineReposPagesPutRequestJsonX77b75e46").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineReposPagesPutRequestJsonX77b75e46(element: JsonElement): InlineReposPagesPutRequestJsonX77b75e46Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonElement>()
  val matchesBranch2 = element.isJsonDecodable<JsonElement>()
  val matchesBranch3 = element.isJsonDecodable<JsonElement>()
  val matchesBranch4 = element.isJsonDecodable<JsonElement>()
  val matchesBranch5 = element.isJsonDecodable<JsonElement>()
  return InlineReposPagesPutRequestJsonX77b75e46Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    matchesBranch3 = matchesBranch3,
    matchesBranch4 = matchesBranch4,
    matchesBranch5 = matchesBranch5,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonElement")
      if (!matchesBranch2) add("Branch2: value does not match JsonElement")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
      if (!matchesBranch4) add("Branch4: value does not match JsonElement")
      if (!matchesBranch5) add("Branch5: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
