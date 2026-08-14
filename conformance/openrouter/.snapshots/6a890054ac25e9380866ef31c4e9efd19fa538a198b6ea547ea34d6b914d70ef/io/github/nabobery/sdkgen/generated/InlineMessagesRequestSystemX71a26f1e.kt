package io.github.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineMessagesRequestSystemX71a26f1eBranch {
  Branch1,
  Branch2,
}

public sealed class InlineMessagesRequestSystemX71a26f1eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineMessagesRequestSystemX71a26f1eNoMatchException(
  message: String,
) : InlineMessagesRequestSystemX71a26f1eDecodingException(message)

internal data class InlineMessagesRequestSystemX71a26f1eInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/system.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/system
 */
@Serializable(with = InlineMessagesRequestSystemX71a26f1e.Serializer::class)
public class InlineMessagesRequestSystemX71a26f1e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineMessagesRequestSystemX71a26f1eInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: List<AnthropicTextBlockParam>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<List<AnthropicTextBlockParam>>(raw) else null }

  public val matchedBranches: Set<InlineMessagesRequestSystemX71a26f1eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineMessagesRequestSystemX71a26f1eBranch.Branch1)
      if (inspection.matchesBranch2) add(InlineMessagesRequestSystemX71a26f1eBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineMessagesRequestSystemX71a26f1e {
      val inspection = inspectInlineMessagesRequestSystemX71a26f1e(raw)
      if (inspection.matchCount == 0) {
        throw InlineMessagesRequestSystemX71a26f1eNoMatchException("InlineMessagesRequestSystemX71a26f1e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineMessagesRequestSystemX71a26f1e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesRequestSystemX71a26f1e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestSystemX71a26f1e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestSystemX71a26f1e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestSystemX71a26f1e) {
      encoder.requireJsonEncoder("InlineMessagesRequestSystemX71a26f1e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineMessagesRequestSystemX71a26f1e(element: JsonElement): InlineMessagesRequestSystemX71a26f1eInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<AnthropicTextBlockParam>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlineMessagesRequestSystemX71a26f1eInspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match List")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
