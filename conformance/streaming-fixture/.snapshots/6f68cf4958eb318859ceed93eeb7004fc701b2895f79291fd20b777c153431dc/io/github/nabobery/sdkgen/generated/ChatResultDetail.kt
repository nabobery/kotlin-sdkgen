package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

public sealed class ChatResultDetailDecodingException(
  message: String,
) : SerializationException(message)

public class ChatResultDetailNoMatchException(
  message: String,
) : ChatResultDetailDecodingException(message)

public class ChatResultDetailAmbiguityException(
  message: String,
) : ChatResultDetailDecodingException(message)

public class ChatResultDetailBranchValidationException(
  message: String,
) : ChatResultDetailDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/ChatResultDetail.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatResultDetail
 */
@Serializable(with = ChatResultDetailSerializer::class)
public sealed interface ChatResultDetail {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class ChatTextDetail internal constructor(
    public val text: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatResultDetail {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(text: String): ChatTextDetail {
        val raw = buildJsonObject {
          put("text", text)
        }
        val inspection = inspectChatResultDetail(raw)
        if (inspection.size == 0) {
          throw ChatResultDetailNoMatchException("ChatResultDetail matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.chatTextDetailMatches) {
          throw ChatResultDetailBranchValidationException("ChatTextDetail factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ChatResultDetailAmbiguityException("ChatResultDetail matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ChatTextDetail(
          text = text,
          raw = raw,
        )
      }
    }
  }

  public class ChatBlockedDetail internal constructor(
    public val reason: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatResultDetail {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(reason: String): ChatBlockedDetail {
        val raw = buildJsonObject {
          put("reason", reason)
        }
        val inspection = inspectChatResultDetail(raw)
        if (inspection.size == 0) {
          throw ChatResultDetailNoMatchException("ChatResultDetail matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.chatBlockedDetailMatches) {
          throw ChatResultDetailBranchValidationException("ChatBlockedDetail factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ChatResultDetailAmbiguityException("ChatResultDetail matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ChatBlockedDetail(
          reason = reason,
          raw = raw,
        )
      }
    }
  }
}

internal object ChatResultDetailSerializer : KSerializer<ChatResultDetail> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): ChatResultDetail {
    val jsonDecoder = decoder.requireJsonDecoder("ChatResultDetail")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw ChatResultDetailNoMatchException("ChatResultDetail matched 0 branches: expected JSON object")
    val matches = inspectChatResultDetail(rawObject)
    if (matches.size == 0) {
      throw ChatResultDetailNoMatchException("ChatResultDetail matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw ChatResultDetailAmbiguityException("ChatResultDetail matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.chatTextDetailMatches -> ChatResultDetail.ChatTextDetail(text = requireNotNull(matches.text), raw = rawObject)
      matches.chatBlockedDetailMatches -> ChatResultDetail.ChatBlockedDetail(reason = requireNotNull(matches.reason), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: ChatResultDetail) {
    encoder.requireJsonEncoder("ChatResultDetail").encodeJsonElement(value.raw)
  }
}

internal data class ChatResultDetailInspection(
  public val text: String?,
  public val textDecoded: Boolean,
  public val reason: String?,
  public val reasonDecoded: Boolean,
  public val chatTextDetailMatches: Boolean,
  public val chatBlockedDetailMatches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (chatTextDetailMatches) add("ChatTextDetail")
      if (chatBlockedDetailMatches) add("ChatBlockedDetail")
    }

  public val size: Int
    get() = names.size
}

private fun inspectChatResultDetail(rawObject: JsonObject): ChatResultDetailInspection {
  val textResult = rawObject["text"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val text = textResult?.getOrNull()
  val textDecoded = textResult?.isSuccess == true
  val reasonResult = rawObject["reason"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val reason = reasonResult?.getOrNull()
  val reasonDecoded = reasonResult?.isSuccess == true
  val rawEmpty = rawObject.isEmpty()
  val chatTextDetailMatches = textDecoded
  val chatBlockedDetailMatches = reasonDecoded
  return ChatResultDetailInspection(
    text = text,
    textDecoded = textDecoded,
    reason = reason,
    reasonDecoded = reasonDecoded,
    chatTextDetailMatches = chatTextDetailMatches,
    chatBlockedDetailMatches = chatBlockedDetailMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!chatTextDetailMatches) add("ChatTextDetail: branch predicate did not match properties 'text'")
      if (!chatBlockedDetailMatches) add("ChatBlockedDetail: branch predicate did not match properties 'reason'")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
