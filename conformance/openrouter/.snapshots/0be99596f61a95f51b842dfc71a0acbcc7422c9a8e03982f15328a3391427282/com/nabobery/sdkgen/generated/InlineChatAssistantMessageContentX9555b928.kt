package com.nabobery.sdkgen.generated

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

public enum class InlineChatAssistantMessageContentX9555b928Branch {
  Branch1,
  Branch2,
  Branch3,
}

public sealed class InlineChatAssistantMessageContentX9555b928DecodingException(
  message: String,
) : SerializationException(message)

public class InlineChatAssistantMessageContentX9555b928NoMatchException(
  message: String,
) : InlineChatAssistantMessageContentX9555b928DecodingException(message)

internal data class InlineChatAssistantMessageContentX9555b928Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3).count { it }
}

/**
 * Assistant message content
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatAssistantMessage/properties/content
 */
@Serializable(with = InlineChatAssistantMessageContentX9555b928.Serializer::class)
public class InlineChatAssistantMessageContentX9555b928 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineChatAssistantMessageContentX9555b928Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: List<ChatContentItems>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<List<ChatContentItems>>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches: Set<InlineChatAssistantMessageContentX9555b928Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineChatAssistantMessageContentX9555b928Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineChatAssistantMessageContentX9555b928Branch.Branch2)
      if (inspection.matchesBranch3) add(InlineChatAssistantMessageContentX9555b928Branch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineChatAssistantMessageContentX9555b928 {
      val inspection = inspectInlineChatAssistantMessageContentX9555b928(raw)
      if (inspection.matchCount == 0) {
        throw InlineChatAssistantMessageContentX9555b928NoMatchException("InlineChatAssistantMessageContentX9555b928 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineChatAssistantMessageContentX9555b928(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineChatAssistantMessageContentX9555b928> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChatAssistantMessageContentX9555b928 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChatAssistantMessageContentX9555b928")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineChatAssistantMessageContentX9555b928) {
      encoder.requireJsonEncoder("InlineChatAssistantMessageContentX9555b928").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineChatAssistantMessageContentX9555b928(element: JsonElement): InlineChatAssistantMessageContentX9555b928Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<ChatContentItems>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return InlineChatAssistantMessageContentX9555b928Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match List")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
