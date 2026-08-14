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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1PricesPostRequestFormTiersItemUpToXb4358f45Branch {
  InlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48,
  Branch2,
}

public sealed class InlineV1PricesPostRequestFormTiersItemUpToXb4358f45DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PricesPostRequestFormTiersItemUpToXb4358f45NoMatchException(
  message: String,
) : InlineV1PricesPostRequestFormTiersItemUpToXb4358f45DecodingException(message)

internal data class InlineV1PricesPostRequestFormTiersItemUpToXb4358f45Inspection(
  public val matchesInlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/tiers/items/properties/up_to.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/tiers/items/properties/up_to
 */
@Serializable(with = InlineV1PricesPostRequestFormTiersItemUpToXb4358f45.Serializer::class)
public class InlineV1PricesPostRequestFormTiersItemUpToXb4358f45 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PricesPostRequestFormTiersItemUpToXb4358f45Inspection,
) {
  public val inlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48:
      InlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48) json.decodeFromJsonElement<InlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1PricesPostRequestFormTiersItemUpToXb4358f45Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48) add(InlineV1PricesPostRequestFormTiersItemUpToXb4358f45Branch.InlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48)
      if (inspection.matchesBranch2) add(InlineV1PricesPostRequestFormTiersItemUpToXb4358f45Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PricesPostRequestFormTiersItemUpToXb4358f45 {
      val inspection = inspectInlineV1PricesPostRequestFormTiersItemUpToXb4358f45(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PricesPostRequestFormTiersItemUpToXb4358f45NoMatchException("InlineV1PricesPostRequestFormTiersItemUpToXb4358f45 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PricesPostRequestFormTiersItemUpToXb4358f45(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PricesPostRequestFormTiersItemUpToXb4358f45> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PricesPostRequestFormTiersItemUpToXb4358f45 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PricesPostRequestFormTiersItemUpToXb4358f45")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PricesPostRequestFormTiersItemUpToXb4358f45) {
      encoder.requireJsonEncoder("InlineV1PricesPostRequestFormTiersItemUpToXb4358f45").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PricesPostRequestFormTiersItemUpToXb4358f45(element: JsonElement): InlineV1PricesPostRequestFormTiersItemUpToXb4358f45Inspection {
  val matchesInlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48 = element.isJsonDecodable<InlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1PricesPostRequestFormTiersItemUpToXb4358f45Inspection(
    matchesInlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48 = matchesInlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48) add("InlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48: value does not match InlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
