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

public enum class InlineChatSystemMessageContentX1d9f1659Branch {
  Branch1,
  Branch2,
}

public sealed class InlineChatSystemMessageContentX1d9f1659DecodingException(
  message: String,
) : SerializationException(message)

public class InlineChatSystemMessageContentX1d9f1659NoMatchException(
  message: String,
) : InlineChatSystemMessageContentX1d9f1659DecodingException(message)

internal data class InlineChatSystemMessageContentX1d9f1659Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * System message content
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatSystemMessage/properties/content
 */
@Serializable(with = InlineChatSystemMessageContentX1d9f1659.Serializer::class)
public class InlineChatSystemMessageContentX1d9f1659 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineChatSystemMessageContentX1d9f1659Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: List<ChatContentText>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<List<ChatContentText>>(raw) else null }

  public val matchedBranches: Set<InlineChatSystemMessageContentX1d9f1659Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineChatSystemMessageContentX1d9f1659Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineChatSystemMessageContentX1d9f1659Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineChatSystemMessageContentX1d9f1659 {
      val inspection = inspectInlineChatSystemMessageContentX1d9f1659(raw)
      if (inspection.matchCount == 0) {
        throw InlineChatSystemMessageContentX1d9f1659NoMatchException("InlineChatSystemMessageContentX1d9f1659 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineChatSystemMessageContentX1d9f1659(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineChatSystemMessageContentX1d9f1659> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChatSystemMessageContentX1d9f1659 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChatSystemMessageContentX1d9f1659")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineChatSystemMessageContentX1d9f1659) {
      encoder.requireJsonEncoder("InlineChatSystemMessageContentX1d9f1659").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineChatSystemMessageContentX1d9f1659(element: JsonElement): InlineChatSystemMessageContentX1d9f1659Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<ChatContentText>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlineChatSystemMessageContentX1d9f1659Inspection(
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
