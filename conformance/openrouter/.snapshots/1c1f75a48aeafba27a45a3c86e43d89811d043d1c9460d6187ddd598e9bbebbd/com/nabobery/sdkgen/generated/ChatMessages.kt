package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Pair
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

public sealed class ChatMessagesDecodingException(
  message: String,
) : SerializationException(message)

public class ChatMessagesNoMatchException(
  message: String,
) : ChatMessagesDecodingException(message)

public class ChatMessagesAmbiguityException(
  message: String,
) : ChatMessagesDecodingException(message)

public class ChatMessagesBranchValidationException(
  message: String,
) : ChatMessagesDecodingException(message)

/**
 * Chat completion message with role-based discrimination
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatMessages
 */
@Serializable(with = ChatMessagesSerializer::class)
public sealed interface ChatMessages {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class ChatSystemMessage internal constructor(
    public val content: InlineChatSystemMessageContentX1d9f1659,
    public val role: InlineChatSystemMessageRoleX9f2ec5e2,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatMessages {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(content: InlineChatSystemMessageContentX1d9f1659, role: InlineChatSystemMessageRoleX9f2ec5e2): ChatSystemMessage {
        val raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(content))
          put("role", SdkJson.encodeToJsonElement(role))
        }
        val inspection = inspectChatMessages(raw)
        if (inspection.size == 0) {
          throw ChatMessagesNoMatchException("ChatMessages matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.chatSystemMessageMatches) {
          throw ChatMessagesBranchValidationException("ChatSystemMessage factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ChatMessagesAmbiguityException("ChatMessages matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ChatSystemMessage(
          content = content,
          role = role,
          raw = raw,
        )
      }
    }
  }

  public class ChatUserMessage internal constructor(
    public val content: InlineChatUserMessageContentX51a5516a,
    public val role: InlineChatUserMessageRoleXc7a5143a,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatMessages {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(content: InlineChatUserMessageContentX51a5516a, role: InlineChatUserMessageRoleXc7a5143a): ChatUserMessage {
        val raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(content))
          put("role", SdkJson.encodeToJsonElement(role))
        }
        val inspection = inspectChatMessages(raw)
        if (inspection.size == 0) {
          throw ChatMessagesNoMatchException("ChatMessages matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.chatUserMessageMatches) {
          throw ChatMessagesBranchValidationException("ChatUserMessage factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ChatMessagesAmbiguityException("ChatMessages matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ChatUserMessage(
          content = content,
          role = role,
          raw = raw,
        )
      }
    }
  }

  public class ChatDeveloperMessage internal constructor(
    public val content: InlineChatDeveloperMessageContentX72a11979,
    public val role: InlineChatDeveloperMessageRoleXaca6c656,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatMessages {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(content: InlineChatDeveloperMessageContentX72a11979, role: InlineChatDeveloperMessageRoleXaca6c656): ChatDeveloperMessage {
        val raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(content))
          put("role", SdkJson.encodeToJsonElement(role))
        }
        val inspection = inspectChatMessages(raw)
        if (inspection.size == 0) {
          throw ChatMessagesNoMatchException("ChatMessages matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.chatDeveloperMessageMatches) {
          throw ChatMessagesBranchValidationException("ChatDeveloperMessage factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ChatMessagesAmbiguityException("ChatMessages matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ChatDeveloperMessage(
          content = content,
          role = role,
          raw = raw,
        )
      }
    }
  }

  public class ChatAssistantMessage internal constructor(
    public val role: InlineChatAssistantMessageRoleX885f4543,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatMessages {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(role: InlineChatAssistantMessageRoleX885f4543): ChatAssistantMessage {
        val raw = buildJsonObject {
          put("role", SdkJson.encodeToJsonElement(role))
        }
        val inspection = inspectChatMessages(raw)
        if (inspection.size == 0) {
          throw ChatMessagesNoMatchException("ChatMessages matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.chatAssistantMessageMatches) {
          throw ChatMessagesBranchValidationException("ChatAssistantMessage factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ChatMessagesAmbiguityException("ChatMessages matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ChatAssistantMessage(
          role = role,
          raw = raw,
        )
      }
    }
  }

  public class ChatToolMessage internal constructor(
    public val content: InlineChatToolMessageContentX7f7879b5,
    public val role: InlineChatToolMessageRoleXd22779fe,
    public val toolCallId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatMessages {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        content: InlineChatToolMessageContentX7f7879b5,
        role: InlineChatToolMessageRoleXd22779fe,
        toolCallId: String,
      ): ChatToolMessage {
        val raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(content))
          put("role", SdkJson.encodeToJsonElement(role))
          put("tool_call_id", toolCallId)
        }
        val inspection = inspectChatMessages(raw)
        if (inspection.size == 0) {
          throw ChatMessagesNoMatchException("ChatMessages matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.chatToolMessageMatches) {
          throw ChatMessagesBranchValidationException("ChatToolMessage factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ChatMessagesAmbiguityException("ChatMessages matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ChatToolMessage(
          content = content,
          role = role,
          toolCallId = toolCallId,
          raw = raw,
        )
      }
    }
  }
}

internal object ChatMessagesSerializer : KSerializer<ChatMessages> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): ChatMessages {
    val jsonDecoder = decoder.requireJsonDecoder("ChatMessages")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw ChatMessagesNoMatchException("ChatMessages matched 0 branches: expected JSON object")
    val matches = inspectChatMessages(rawObject)
    if (matches.size == 0) {
      throw ChatMessagesNoMatchException("ChatMessages matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw ChatMessagesAmbiguityException("ChatMessages matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.chatSystemMessageMatches -> ChatMessages.ChatSystemMessage(content = requireNotNull(matches.contentState2), role = requireNotNull(matches.roleState5), raw = rawObject)
      matches.chatUserMessageMatches -> ChatMessages.ChatUserMessage(content = requireNotNull(matches.contentState4), role = requireNotNull(matches.roleState9), raw = rawObject)
      matches.chatDeveloperMessageMatches -> ChatMessages.ChatDeveloperMessage(content = requireNotNull(matches.contentState1), role = requireNotNull(matches.roleState3), raw = rawObject)
      matches.chatAssistantMessageMatches -> ChatMessages.ChatAssistantMessage(role = requireNotNull(matches.roleState1), raw = rawObject)
      matches.chatToolMessageMatches -> ChatMessages.ChatToolMessage(content = requireNotNull(matches.contentState3), role = requireNotNull(matches.roleState7), toolCallId = requireNotNull(matches.toolCallId), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: ChatMessages) {
    encoder.requireJsonEncoder("ChatMessages").encodeJsonElement(value.raw)
  }
}

internal data class ChatMessagesInspection(
  public val roleState5: InlineChatSystemMessageRoleX9f2ec5e2?,
  public val roleState5Decoded: Boolean,
  public val roleState5Matches: Boolean,
  public val contentState2: InlineChatSystemMessageContentX1d9f1659?,
  public val contentState2Decoded: Boolean,
  public val roleState6: InlineChatSystemMessageRoleX9f2ec5e2?,
  public val roleState6Decoded: Boolean,
  public val roleState6Matches: Boolean,
  public val roleState9: InlineChatUserMessageRoleXc7a5143a?,
  public val roleState9Decoded: Boolean,
  public val roleState9Matches: Boolean,
  public val contentState4: InlineChatUserMessageContentX51a5516a?,
  public val contentState4Decoded: Boolean,
  public val roleState10: InlineChatUserMessageRoleXc7a5143a?,
  public val roleState10Decoded: Boolean,
  public val roleState10Matches: Boolean,
  public val roleState3: InlineChatDeveloperMessageRoleXaca6c656?,
  public val roleState3Decoded: Boolean,
  public val roleState3Matches: Boolean,
  public val contentState1: InlineChatDeveloperMessageContentX72a11979?,
  public val contentState1Decoded: Boolean,
  public val roleState4: InlineChatDeveloperMessageRoleXaca6c656?,
  public val roleState4Decoded: Boolean,
  public val roleState4Matches: Boolean,
  public val roleState1: InlineChatAssistantMessageRoleX885f4543?,
  public val roleState1Decoded: Boolean,
  public val roleState1Matches: Boolean,
  public val roleState2: InlineChatAssistantMessageRoleX885f4543?,
  public val roleState2Decoded: Boolean,
  public val roleState2Matches: Boolean,
  public val roleState7: InlineChatToolMessageRoleXd22779fe?,
  public val roleState7Decoded: Boolean,
  public val roleState7Matches: Boolean,
  public val contentState3: InlineChatToolMessageContentX7f7879b5?,
  public val contentState3Decoded: Boolean,
  public val roleState8: InlineChatToolMessageRoleXd22779fe?,
  public val roleState8Decoded: Boolean,
  public val roleState8Matches: Boolean,
  public val toolCallId: String?,
  public val toolCallIdDecoded: Boolean,
  public val chatSystemMessageMatches: Boolean,
  public val chatUserMessageMatches: Boolean,
  public val chatDeveloperMessageMatches: Boolean,
  public val chatAssistantMessageMatches: Boolean,
  public val chatToolMessageMatches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (chatSystemMessageMatches) add("ChatSystemMessage")
      if (chatUserMessageMatches) add("ChatUserMessage")
      if (chatDeveloperMessageMatches) add("ChatDeveloperMessage")
      if (chatAssistantMessageMatches) add("ChatAssistantMessage")
      if (chatToolMessageMatches) add("ChatToolMessage")
    }

  public val size: Int
    get() = names.size
}

private fun inspectChatMessages(rawObject: JsonObject): ChatMessagesInspection {
  val roleState5Result = rawObject["role"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatSystemMessageRoleX9f2ec5e2>(element) } }
  val roleState5 = roleState5Result?.getOrNull()
  val roleState5Decoded = roleState5Result?.isSuccess == true
  val roleState5Matches = (rawObject.stringValue("role") == "system") && roleState5Decoded
  val contentState2Result = rawObject["content"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatSystemMessageContentX1d9f1659>(element) } }
  val contentState2 = contentState2Result?.getOrNull()
  val contentState2Decoded = contentState2Result?.isSuccess == true
  val roleState6Result = rawObject["role"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatSystemMessageRoleX9f2ec5e2>(element) } }
  val roleState6 = roleState6Result?.getOrNull()
  val roleState6Decoded = roleState6Result?.isSuccess == true
  val roleState6Matches = (rawObject.stringValue("role") == "system") && roleState6Decoded
  val roleState9Result = rawObject["role"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatUserMessageRoleXc7a5143a>(element) } }
  val roleState9 = roleState9Result?.getOrNull()
  val roleState9Decoded = roleState9Result?.isSuccess == true
  val roleState9Matches = (rawObject.stringValue("role") == "user") && roleState9Decoded
  val contentState4Result = rawObject["content"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatUserMessageContentX51a5516a>(element) } }
  val contentState4 = contentState4Result?.getOrNull()
  val contentState4Decoded = contentState4Result?.isSuccess == true
  val roleState10Result = rawObject["role"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatUserMessageRoleXc7a5143a>(element) } }
  val roleState10 = roleState10Result?.getOrNull()
  val roleState10Decoded = roleState10Result?.isSuccess == true
  val roleState10Matches = (rawObject.stringValue("role") == "user") && roleState10Decoded
  val roleState3Result = rawObject["role"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatDeveloperMessageRoleXaca6c656>(element) } }
  val roleState3 = roleState3Result?.getOrNull()
  val roleState3Decoded = roleState3Result?.isSuccess == true
  val roleState3Matches = (rawObject.stringValue("role") == "developer") && roleState3Decoded
  val contentState1Result = rawObject["content"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatDeveloperMessageContentX72a11979>(element) } }
  val contentState1 = contentState1Result?.getOrNull()
  val contentState1Decoded = contentState1Result?.isSuccess == true
  val roleState4Result = rawObject["role"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatDeveloperMessageRoleXaca6c656>(element) } }
  val roleState4 = roleState4Result?.getOrNull()
  val roleState4Decoded = roleState4Result?.isSuccess == true
  val roleState4Matches = (rawObject.stringValue("role") == "developer") && roleState4Decoded
  val roleState1Result = rawObject["role"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatAssistantMessageRoleX885f4543>(element) } }
  val roleState1 = roleState1Result?.getOrNull()
  val roleState1Decoded = roleState1Result?.isSuccess == true
  val roleState1Matches = (rawObject.stringValue("role") == "assistant") && roleState1Decoded
  val roleState2Result = rawObject["role"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatAssistantMessageRoleX885f4543>(element) } }
  val roleState2 = roleState2Result?.getOrNull()
  val roleState2Decoded = roleState2Result?.isSuccess == true
  val roleState2Matches = (rawObject.stringValue("role") == "assistant") && roleState2Decoded
  val roleState7Result = rawObject["role"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatToolMessageRoleXd22779fe>(element) } }
  val roleState7 = roleState7Result?.getOrNull()
  val roleState7Decoded = roleState7Result?.isSuccess == true
  val roleState7Matches = (rawObject.stringValue("role") == "tool") && roleState7Decoded
  val contentState3Result = rawObject["content"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatToolMessageContentX7f7879b5>(element) } }
  val contentState3 = contentState3Result?.getOrNull()
  val contentState3Decoded = contentState3Result?.isSuccess == true
  val roleState8Result = rawObject["role"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatToolMessageRoleXd22779fe>(element) } }
  val roleState8 = roleState8Result?.getOrNull()
  val roleState8Decoded = roleState8Result?.isSuccess == true
  val roleState8Matches = (rawObject.stringValue("role") == "tool") && roleState8Decoded
  val toolCallIdResult = rawObject["tool_call_id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val toolCallId = toolCallIdResult?.getOrNull()
  val toolCallIdDecoded = toolCallIdResult?.isSuccess == true
  val rawEmpty = rawObject.isEmpty()
  val chatSystemMessageMatches = matchesChatMessagesChatSystemMessageBranch(rawObject) && (roleState5Matches)
  val chatUserMessageMatches = matchesChatMessagesChatUserMessageBranch(rawObject) && (roleState9Matches)
  val chatDeveloperMessageMatches = matchesChatMessagesChatDeveloperMessageBranch(rawObject) && (roleState3Matches)
  val chatAssistantMessageMatches = matchesChatMessagesChatAssistantMessageBranch(rawObject) && (roleState1Matches)
  val chatToolMessageMatches = matchesChatMessagesChatToolMessageBranch(rawObject) && (roleState7Matches)
  return ChatMessagesInspection(
    roleState5 = roleState5,
    roleState5Decoded = roleState5Decoded,
    roleState5Matches = roleState5Matches,
    contentState2 = contentState2,
    contentState2Decoded = contentState2Decoded,
    roleState6 = roleState6,
    roleState6Decoded = roleState6Decoded,
    roleState6Matches = roleState6Matches,
    roleState9 = roleState9,
    roleState9Decoded = roleState9Decoded,
    roleState9Matches = roleState9Matches,
    contentState4 = contentState4,
    contentState4Decoded = contentState4Decoded,
    roleState10 = roleState10,
    roleState10Decoded = roleState10Decoded,
    roleState10Matches = roleState10Matches,
    roleState3 = roleState3,
    roleState3Decoded = roleState3Decoded,
    roleState3Matches = roleState3Matches,
    contentState1 = contentState1,
    contentState1Decoded = contentState1Decoded,
    roleState4 = roleState4,
    roleState4Decoded = roleState4Decoded,
    roleState4Matches = roleState4Matches,
    roleState1 = roleState1,
    roleState1Decoded = roleState1Decoded,
    roleState1Matches = roleState1Matches,
    roleState2 = roleState2,
    roleState2Decoded = roleState2Decoded,
    roleState2Matches = roleState2Matches,
    roleState7 = roleState7,
    roleState7Decoded = roleState7Decoded,
    roleState7Matches = roleState7Matches,
    contentState3 = contentState3,
    contentState3Decoded = contentState3Decoded,
    roleState8 = roleState8,
    roleState8Decoded = roleState8Decoded,
    roleState8Matches = roleState8Matches,
    toolCallId = toolCallId,
    toolCallIdDecoded = toolCallIdDecoded,
    chatSystemMessageMatches = chatSystemMessageMatches,
    chatUserMessageMatches = chatUserMessageMatches,
    chatDeveloperMessageMatches = chatDeveloperMessageMatches,
    chatAssistantMessageMatches = chatAssistantMessageMatches,
    chatToolMessageMatches = chatToolMessageMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!chatSystemMessageMatches) add("ChatSystemMessage: branch predicate did not match properties 'role'")
      if (!chatUserMessageMatches) add("ChatUserMessage: branch predicate did not match properties 'role'")
      if (!chatDeveloperMessageMatches) add("ChatDeveloperMessage: branch predicate did not match properties 'role'")
      if (!chatAssistantMessageMatches) add("ChatAssistantMessage: branch predicate did not match properties 'role'")
      if (!chatToolMessageMatches) add("ChatToolMessage: branch predicate did not match properties 'role'")
    },
  )
}

private fun matchesChatMessagesChatSystemMessageBranch(rawObject: JsonObject): Boolean = true

private fun matchesChatMessagesChatUserMessageBranch(rawObject: JsonObject): Boolean = true

private fun matchesChatMessagesChatDeveloperMessageBranch(rawObject: JsonObject): Boolean = true

private fun matchesChatMessagesChatAssistantMessageBranch(rawObject: JsonObject): Boolean = true

private fun matchesChatMessagesChatToolMessageBranch(rawObject: JsonObject): Boolean = true

private fun schemaExactDecimal(`value`: String): SchemaDecimal? {
  val match = Regex("^(-?)(0|[1-9]\\d*)(?:\\.(\\d+))?(?:[eE]([+-]?\\d+))?$").matchEntire(value) ?: return null
  var digits = (match.groupValues[2] + match.groupValues[3]).trimStart('0').ifEmpty { "0" }
  if (digits == "0") return SchemaDecimal(false, "0", SchemaInteger(false, "0"))
  var scale = schemaIntegerSubtract(
      SchemaInteger(false, match.groupValues[3].length.toString()),
      requireNotNull(schemaInteger(match.groupValues[4].ifEmpty { "0" })),
  )
  while (digits.length > 1 && digits.endsWith('0')) {
      digits = digits.dropLast(1)
      scale = schemaIntegerSubtract(scale, SchemaInteger(false, "1"))
  }
  return SchemaDecimal(match.groupValues[1] == "-", digits, scale)
}

private fun schemaInteger(`value`: String): SchemaInteger? {
  val match = Regex("^([+-]?)(\\d+)$").matchEntire(value) ?: return null
  val digits = match.groupValues[2].trimStart('0').ifEmpty { "0" }
  return SchemaInteger(match.groupValues[1] == "-" && digits != "0", digits)
}

private fun schemaIntegerCompare(left: SchemaInteger, right: SchemaInteger): Int {
  if (left.negative != right.negative) return if (left.negative) -1 else 1
  val comparison = schemaIntegerMagnitudeCompare(left.digits, right.digits)
  return if (left.negative) -comparison else comparison
}

private fun schemaIntegerMagnitudeCompare(left: String, right: String): Int {
  if (left.length != right.length) return left.length.compareTo(right.length)
  return left.compareTo(right)
}

private fun schemaIntegerSubtract(left: SchemaInteger, right: SchemaInteger): SchemaInteger = schemaIntegerAdd(left, SchemaInteger(!right.negative && right.digits != "0", right.digits))

private fun schemaIntegerAdd(left: SchemaInteger, right: SchemaInteger): SchemaInteger {
  if (left.negative == right.negative) return SchemaInteger(left.negative, schemaIntegerMagnitudeAdd(left.digits, right.digits))
  val comparison = schemaIntegerMagnitudeCompare(left.digits, right.digits)
  if (comparison == 0) return SchemaInteger(false, "0")
  return if (comparison > 0) {
      SchemaInteger(left.negative, schemaIntegerMagnitudeSubtract(left.digits, right.digits))
  } else {
      SchemaInteger(right.negative, schemaIntegerMagnitudeSubtract(right.digits, left.digits))
  }
}

private fun schemaIntegerMagnitudeAdd(left: String, right: String): String {
  val result = StringBuilder()
  var carry = 0
  val width = maxOf(left.length, right.length)
  for (offset in 0 until width) {
      val leftDigit = left.getOrNull(left.length - 1 - offset)?.minus('0') ?: 0
      val rightDigit = right.getOrNull(right.length - 1 - offset)?.minus('0') ?: 0
      val total = leftDigit + rightDigit + carry
      result.append(('0'.code + total % 10).toChar())
      carry = total / 10
  }
  if (carry > 0) result.append(('0'.code + carry).toChar())
  return result.reverse().toString()
}

private fun schemaIntegerMagnitudeSubtract(left: String, right: String): String {
  val result = StringBuilder()
  var borrow = 0
  for (offset in left.indices) {
      var digit = left[left.length - 1 - offset] - '0' - borrow
      val subtrahend = right.getOrNull(right.length - 1 - offset)?.minus('0') ?: 0
      if (digit < subtrahend) { digit += 10; borrow = 1 } else borrow = 0
      result.append(('0'.code + digit - subtrahend).toChar())
  }
  return result.reverse().toString().trimStart('0').ifEmpty { "0" }
}

private fun schemaExactCompare(left: SchemaDecimal, right: SchemaDecimal): Int {
  if (left.negative != right.negative) return if (left.negative) -1 else 1
  val comparison = schemaExactMagnitudeCompare(left, right)
  return if (left.negative) -comparison else comparison
}

private fun schemaExactMagnitudeCompare(left: SchemaDecimal, right: SchemaDecimal): Int {
  val leftPower = schemaIntegerSubtract(SchemaInteger(false, (left.digits.length - 1).toString()), left.scale)
  val rightPower = schemaIntegerSubtract(SchemaInteger(false, (right.digits.length - 1).toString()), right.scale)
  val powerComparison = schemaIntegerCompare(leftPower, rightPower)
  if (powerComparison != 0) return powerComparison
  val width = maxOf(left.digits.length, right.digits.length)
  for (index in 0 until width) {
      val leftDigit = left.digits.getOrNull(index) ?: '0'
      val rightDigit = right.digits.getOrNull(index) ?: '0'
      if (leftDigit != rightDigit) return leftDigit.compareTo(rightDigit)
  }
  return 0
}

private fun schemaExactIsMultipleOf(`value`: SchemaDecimal, divisor: SchemaDecimal): Boolean {
  if (divisor.digits == "0") return false
  if (value.digits == "0") return true
  val shift = schemaIntegerSubtract(divisor.scale, value.scale)
  if (schemaIntegerCompare(shift, SchemaInteger(false, "0")) < 0) return false
  val divisorTwos = schemaFactorCount(divisor.digits, 2)
  val divisorFives = schemaFactorCount(divisorTwos.first, 5)
  if (schemaExactRemainder(value.digits, divisorFives.first) != "0") return false
  val valueTwos = schemaFactorCount(value.digits, 2).second
  val valueFives = schemaFactorCount(value.digits, 5).second
  val requiredTwos = (divisorTwos.second - valueTwos).coerceAtLeast(0)
  val requiredFives = (divisorFives.second - valueFives).coerceAtLeast(0)
  return schemaIntegerCompare(shift, SchemaInteger(false, requiredTwos.toString())) >= 0 &&
      schemaIntegerCompare(shift, SchemaInteger(false, requiredFives.toString())) >= 0
}

private fun schemaFactorCount(`value`: String, factor: Int): Pair<String, Int> {
  var remainder = value
  var count = 0
  while (remainder != "0") {
      val division = schemaDivideBySmall(remainder, factor)
      if (division.second != 0) break
      remainder = division.first
      count += 1
  }
  return remainder to count
}

private fun schemaDivideBySmall(`value`: String, divisor: Int): Pair<String, Int> {
  val quotient = StringBuilder()
  var remainder = 0
  value.forEach { digit ->
      val combined = remainder * 10 + (digit - '0')
      quotient.append(('0'.code + combined / divisor).toChar())
      remainder = combined % divisor
  }
  return quotient.toString().trimStart('0').ifEmpty { "0" } to remainder
}

private fun schemaExactRemainder(dividend: String, divisor: String): String {
  if (divisor == "1") return "0"
  var remainder = "0"
  dividend.forEach { digit ->
      remainder = (remainder + digit).trimStart('0').ifEmpty { "0" }
      while (schemaIntegerMagnitudeCompare(remainder, divisor) >= 0) {
          remainder = schemaIntegerMagnitudeSubtract(remainder, divisor)
      }
  }
  return remainder
}

private fun JsonElement.isJsonSchemaNumber(): Boolean {
  val primitive = this as? JsonPrimitive ?: return false
  if (primitive.isString || primitive.content == "true" || primitive.content == "false" || this is JsonNull) return false
  return schemaExactDecimal(primitive.content) != null
}

private fun JsonElement.isJsonSchemaInteger(): Boolean {
  val parts = (this as? JsonPrimitive)?.takeIf { isJsonSchemaNumber() }?.let { schemaExactDecimal(it.content) }
      ?: return false
  return schemaIntegerCompare(parts.scale, SchemaInteger(false, "0")) <= 0
}

private fun JsonElement.matchesJsonSchemaNumber(
  minimum: String?,
  maximum: String?,
  exclusiveMinimum: String?,
  exclusiveMaximum: String?,
  multipleOf: String?,
): Boolean {
  if (!isJsonSchemaNumber()) return true
  val value = requireNotNull(schemaExactDecimal((this as JsonPrimitive).content))
  minimum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) < 0) return false }
  maximum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) > 0) return false }
  exclusiveMinimum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) <= 0) return false }
  exclusiveMaximum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) >= 0) return false }
  multipleOf?.let { if (!schemaExactIsMultipleOf(value, requireNotNull(schemaExactDecimal(it)))) return false }
  return true
}

private fun JsonElement.matchesJsonSchemaString(
  minLength: Int?,
  maxLength: Int?,
  format: String?,
): Boolean {
  val primitive = this as? JsonPrimitive ?: return true
  if (!primitive.isString) return true
  val value = primitive.content
  val length = value.jsonSchemaCodePointCount()
  if (minLength != null && length < minLength) return false
  if (maxLength != null && length > maxLength) return false
  return when (format) {
      null -> true
      "date" -> value.isRfc3339Date()
      "date-time" -> value.isRfc3339DateTime()
      else -> false
  }
}

private fun JsonElement.jsonSchemaEquals(other: JsonElement): Boolean {
  if (this is JsonNull || other is JsonNull) return this is JsonNull && other is JsonNull
  if (this is JsonArray && other is JsonArray) return size == other.size && indices.all { this[it].jsonSchemaEquals(other[it]) }
  if (this is JsonObject && other is JsonObject) return keys == other.keys && keys.all { key -> getValue(key).jsonSchemaEquals(other.getValue(key)) }
  if (this !is JsonPrimitive || other !is JsonPrimitive) return false
  if (isString || other.isString) return isString && other.isString && content == other.content
  if (isJsonSchemaNumber() && other.isJsonSchemaNumber()) {
      return schemaExactCompare(
          requireNotNull(schemaExactDecimal(content)),
          requireNotNull(schemaExactDecimal(other.content)),
      ) == 0
  }
  return content == other.content
}

private fun String.jsonSchemaCodePointCount(): Int {
  var count = 0
  var index = 0
  while (index < length) {
      val highSurrogate = this[index].code in 55296..56319
      val lowSurrogate = index + 1 < length && this[index + 1].code in 56320..57343
      index += if (highSurrogate && lowSurrogate) 2 else 1
      count += 1
  }
  return count
}

private fun String.isRfc3339Date(): Boolean {
  val match = Regex("^(\\d{4})-(\\d{2})-(\\d{2})$").matchEntire(this) ?: return false
  return isValidRfc3339Date(match.groupValues[1].toInt(), match.groupValues[2].toInt(), match.groupValues[3].toInt())
}

private fun String.isRfc3339DateTime(): Boolean {
  val match = Regex("^(\\d{4})-(\\d{2})-(\\d{2})[Tt](\\d{2}):(\\d{2}):(\\d{2})(?:\\.\\d+)?([Zz]|[+-]\\d{2}:\\d{2})$")
      .matchEntire(this) ?: return false
  val hour = match.groupValues[4].toInt()
  val minute = match.groupValues[5].toInt()
  val second = match.groupValues[6].toInt()
  val offset = match.groupValues[7]
  val year = match.groupValues[1].toInt()
  val month = match.groupValues[2].toInt()
  val day = match.groupValues[3].toInt()
  if (!isValidRfc3339Date(year, month, day)) return false
  if (hour !in 0..23 || minute !in 0..59 || second !in 0..60) return false
  if (offset.length != 1) {
      val offsetHour = offset.substring(1, 3).toInt()
      val offsetMinute = offset.substring(4, 6).toInt()
      if (offsetHour !in 0..23 || offsetMinute !in 0..59) return false
  }
  return second != 60 || isKnownRfc3339LeapSecond(year, month, day, hour, minute, offset)
}

private fun isValidRfc3339Date(
  year: Int,
  month: Int,
  day: Int,
): Boolean {
  if (month !in 1..12) return false
  val days = when (month) {
      2 -> if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 29 else 28
      4, 6, 9, 11 -> 30
      else -> 31
  }
  return day in 1..days
}

private fun isKnownRfc3339LeapSecond(
  year: Int,
  month: Int,
  day: Int,
  hour: Int,
  minute: Int,
  offset: String,
): Boolean {
  val offsetMinutes =
      if (offset.length == 1) 0
      else {
          val value = offset.substring(1, 3).toInt() * 60 + offset.substring(4, 6).toInt()
          if (offset[0] == '-') -value else value
      }
  val instant = rfc3339DayIndex(year, month, day) * 1_440L + hour * 60L + minute + 1L - offsetMinutes
  return rfc3339LeapSecondInstants().contains(instant)
}

private fun rfc3339DayIndex(
  year: Int,
  month: Int,
  day: Int,
): Long {
  val yearDays = 365L * year + (year + 3L) / 4L - (year + 99L) / 100L + (year + 399L) / 400L
  val monthDays = intArrayOf(0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334)[month - 1]
  val leapDay = if (month > 2 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 1 else 0
  return yearDays + monthDays + leapDay + day - 1L
}

private fun rfc3339LeapSecondInstants(): Set<Long> = setOf(
    (rfc3339DayIndex(1972, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1972, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1973, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1974, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1975, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1976, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1977, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1978, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1979, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1981, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1982, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1983, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1985, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1987, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1989, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1990, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1992, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1993, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1994, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1995, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1997, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1998, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(2005, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(2008, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(2012, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(2015, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(2016, 12, 31) + 1L) * 1_440L,
)

private fun schemaDecimalParts(`value`: String): List<String>? {
  val match = Regex("^(-?)(0|[1-9]\\d*)(?:\\.(\\d+))?(?:[eE]([+-]?\\d+))?$").matchEntire(value) ?: return null
  val exponent = match.groupValues[4].ifEmpty { "0" }.toLongOrNull() ?: return null
  var digits = (match.groupValues[2] + match.groupValues[3]).trimStart('0').ifEmpty { "0" }
  var scale = match.groupValues[3].length.toLong() - exponent
  while (digits.length > 1 && digits.endsWith('0')) {
      digits = digits.dropLast(1)
      scale -= 1L
  }
  return listOf(if (digits == "0") "" else match.groupValues[1], digits, scale.toString())
}

private fun schemaCompare(left: List<String>, right: List<String>): Int {
  val leftNegative = left[0] == "-"
  val rightNegative = right[0] == "-"
  if (leftNegative != rightNegative) return if (leftNegative) -1 else 1
  val comparison = schemaCompareMagnitude(left, right)
  return if (leftNegative) -comparison else comparison
}

private fun schemaCompareMagnitude(left: List<String>, right: List<String>): Int {
  val leftScale = left[2].toLong()
  val rightScale = right[2].toLong()
  val leftPower = left[1].length.toLong() - 1L - leftScale
  val rightPower = right[1].length.toLong() - 1L - rightScale
  if (leftPower != rightPower) return leftPower.compareTo(rightPower)
  val width = maxOf(left[1].length, right[1].length)
  for (index in 0 until width) {
      val leftDigit = left[1].getOrNull(index) ?: '0'
      val rightDigit = right[1].getOrNull(index) ?: '0'
      if (leftDigit != rightDigit) return leftDigit.compareTo(rightDigit)
  }
  return 0
}

private fun schemaIsMultipleOf(`value`: List<String>, divisor: List<String>): Boolean {
  if (divisor[1] == "0") return false
  if (value[1] == "0") return true
  val shift = divisor[2].toLong() - value[2].toLong()
  return if (shift >= 0L) {
      schemaRemainderAfterZeros(value[1], divisor[1], shift) == "0"
  } else {
      val zeros = -shift
      if (zeros > value[1].length.toLong()) false
      else {
          val count = zeros.toInt()
          value[1].takeLast(count).all { it == '0' } && schemaRemainder(value[1].dropLast(count), divisor[1]) == "0"
      }
  }
}

private fun schemaRemainderAfterZeros(
  dividend: String,
  divisor: String,
  zeros: Long,
): String {
  var remainder = schemaRemainder(dividend, divisor)
  var remaining = zeros
  while (remaining > 0L) {
      remainder = schemaRemainder(remainder + "0", divisor)
      remaining -= 1L
  }
  return remainder
}

private fun schemaRemainder(dividend: String, divisor: String): String {
  var remainder = "0"
  dividend.forEach { digit ->
      remainder = (remainder + digit).trimStart('0').ifEmpty { "0" }
      while (schemaCompareInteger(remainder, divisor) >= 0) remainder = schemaSubtractInteger(remainder, divisor)
  }
  return remainder
}

private fun schemaCompareInteger(left: String, right: String): Int {
  if (left.length != right.length) return left.length.compareTo(right.length)
  return left.compareTo(right)
}

private fun schemaSubtractInteger(left: String, right: String): String {
  val result = StringBuilder()
  var borrow = 0
  for (index in left.indices.reversed()) {
      var digit = (left[index] - '0') - borrow
      val subtrahend = right.getOrNull(right.length - (left.length - index))?.minus('0') ?: 0
      if (digit < subtrahend) { digit += 10; borrow = 1 } else borrow = 0
      result.append(('0'.code + digit - subtrahend).toChar())
  }
  return result.reverse().toString().trimStart('0').ifEmpty { "0" }
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
