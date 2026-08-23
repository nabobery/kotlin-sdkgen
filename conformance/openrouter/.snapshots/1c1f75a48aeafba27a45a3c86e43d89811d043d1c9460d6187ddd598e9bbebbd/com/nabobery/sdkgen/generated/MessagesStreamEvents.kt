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

public sealed class MessagesStreamEventsDecodingException(
  message: String,
) : SerializationException(message)

public class MessagesStreamEventsNoMatchException(
  message: String,
) : MessagesStreamEventsDecodingException(message)

public class MessagesStreamEventsAmbiguityException(
  message: String,
) : MessagesStreamEventsDecodingException(message)

public class MessagesStreamEventsBranchValidationException(
  message: String,
) : MessagesStreamEventsDecodingException(message)

/**
 * Union of all possible streaming events
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesStreamEvents
 */
@Serializable(with = MessagesStreamEventsSerializer::class)
public sealed interface MessagesStreamEvents {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class MessagesStartEvent internal constructor(
    public val message: InlineMessagesStartEventMessageX67927c6f,
    public val type: InlineMessagesStartEventTypeX62ab7b72,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : MessagesStreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(message: InlineMessagesStartEventMessageX67927c6f, type: InlineMessagesStartEventTypeX62ab7b72): MessagesStartEvent {
        val raw = buildJsonObject {
          put("message", SdkJson.encodeToJsonElement(message))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectMessagesStreamEvents(raw)
        if (inspection.size == 0) {
          throw MessagesStreamEventsNoMatchException("MessagesStreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.messagesStartEventMatches) {
          throw MessagesStreamEventsBranchValidationException("MessagesStartEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw MessagesStreamEventsAmbiguityException("MessagesStreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return MessagesStartEvent(
          message = message,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class MessagesDeltaEvent internal constructor(
    public val delta: InlineMessagesDeltaEventDeltaXda39e6a6,
    public val type: InlineMessagesDeltaEventTypeXdd5f01d7,
    public val usage: InlineMessagesDeltaEventUsageX9d3c9761,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : MessagesStreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        delta: InlineMessagesDeltaEventDeltaXda39e6a6,
        type: InlineMessagesDeltaEventTypeXdd5f01d7,
        usage: InlineMessagesDeltaEventUsageX9d3c9761,
      ): MessagesDeltaEvent {
        val raw = buildJsonObject {
          put("delta", SdkJson.encodeToJsonElement(delta))
          put("type", SdkJson.encodeToJsonElement(type))
          put("usage", SdkJson.encodeToJsonElement(usage))
        }
        val inspection = inspectMessagesStreamEvents(raw)
        if (inspection.size == 0) {
          throw MessagesStreamEventsNoMatchException("MessagesStreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.messagesDeltaEventMatches) {
          throw MessagesStreamEventsBranchValidationException("MessagesDeltaEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw MessagesStreamEventsAmbiguityException("MessagesStreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return MessagesDeltaEvent(
          delta = delta,
          type = type,
          usage = usage,
          raw = raw,
        )
      }
    }
  }

  public class MessagesStopEvent internal constructor(
    public val type: InlineMessagesStopEventTypeX456a472f,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : MessagesStreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineMessagesStopEventTypeX456a472f): MessagesStopEvent {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectMessagesStreamEvents(raw)
        if (inspection.size == 0) {
          throw MessagesStreamEventsNoMatchException("MessagesStreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.messagesStopEventMatches) {
          throw MessagesStreamEventsBranchValidationException("MessagesStopEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw MessagesStreamEventsAmbiguityException("MessagesStreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return MessagesStopEvent(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class MessagesContentBlockStartEvent internal constructor(
    public val contentBlock: InlineMessagesContentBlockStartEventContentBlockX89752283,
    public val index: Int,
    public val type: InlineMessagesContentBlockStartEventTypeXb466e0f5,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : MessagesStreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        contentBlock: InlineMessagesContentBlockStartEventContentBlockX89752283,
        index: Int,
        type: InlineMessagesContentBlockStartEventTypeXb466e0f5,
      ): MessagesContentBlockStartEvent {
        val raw = buildJsonObject {
          put("content_block", SdkJson.encodeToJsonElement(contentBlock))
          put("index", SdkJson.encodeToJsonElement(index))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectMessagesStreamEvents(raw)
        if (inspection.size == 0) {
          throw MessagesStreamEventsNoMatchException("MessagesStreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.messagesContentBlockStartEventMatches) {
          throw MessagesStreamEventsBranchValidationException("MessagesContentBlockStartEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw MessagesStreamEventsAmbiguityException("MessagesStreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return MessagesContentBlockStartEvent(
          contentBlock = contentBlock,
          index = index,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class MessagesContentBlockDeltaEvent internal constructor(
    public val delta: InlineMessagesContentBlockDeltaEventDeltaX956b8ed8,
    public val index: Int,
    public val type: InlineMessagesContentBlockDeltaEventTypeXceafe8ab,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : MessagesStreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        delta: InlineMessagesContentBlockDeltaEventDeltaX956b8ed8,
        index: Int,
        type: InlineMessagesContentBlockDeltaEventTypeXceafe8ab,
      ): MessagesContentBlockDeltaEvent {
        val raw = buildJsonObject {
          put("delta", SdkJson.encodeToJsonElement(delta))
          put("index", SdkJson.encodeToJsonElement(index))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectMessagesStreamEvents(raw)
        if (inspection.size == 0) {
          throw MessagesStreamEventsNoMatchException("MessagesStreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.messagesContentBlockDeltaEventMatches) {
          throw MessagesStreamEventsBranchValidationException("MessagesContentBlockDeltaEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw MessagesStreamEventsAmbiguityException("MessagesStreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return MessagesContentBlockDeltaEvent(
          delta = delta,
          index = index,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class MessagesContentBlockStopEvent internal constructor(
    public val index: Int,
    public val type: InlineMessagesContentBlockStopEventTypeXac1e8a22,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : MessagesStreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(index: Int, type: InlineMessagesContentBlockStopEventTypeXac1e8a22): MessagesContentBlockStopEvent {
        val raw = buildJsonObject {
          put("index", SdkJson.encodeToJsonElement(index))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectMessagesStreamEvents(raw)
        if (inspection.size == 0) {
          throw MessagesStreamEventsNoMatchException("MessagesStreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.messagesContentBlockStopEventMatches) {
          throw MessagesStreamEventsBranchValidationException("MessagesContentBlockStopEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw MessagesStreamEventsAmbiguityException("MessagesStreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return MessagesContentBlockStopEvent(
          index = index,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class MessagesPingEvent internal constructor(
    public val type: InlineMessagesPingEventTypeX731a5908,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : MessagesStreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineMessagesPingEventTypeX731a5908): MessagesPingEvent {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectMessagesStreamEvents(raw)
        if (inspection.size == 0) {
          throw MessagesStreamEventsNoMatchException("MessagesStreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.messagesPingEventMatches) {
          throw MessagesStreamEventsBranchValidationException("MessagesPingEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw MessagesStreamEventsAmbiguityException("MessagesStreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return MessagesPingEvent(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class MessagesErrorEvent internal constructor(
    public val error: InlineMessagesErrorEventErrorX63070e5e,
    public val type: InlineMessagesErrorEventTypeX637de661,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : MessagesStreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(error: InlineMessagesErrorEventErrorX63070e5e, type: InlineMessagesErrorEventTypeX637de661): MessagesErrorEvent {
        val raw = buildJsonObject {
          put("error", SdkJson.encodeToJsonElement(error))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectMessagesStreamEvents(raw)
        if (inspection.size == 0) {
          throw MessagesStreamEventsNoMatchException("MessagesStreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.messagesErrorEventMatches) {
          throw MessagesStreamEventsBranchValidationException("MessagesErrorEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw MessagesStreamEventsAmbiguityException("MessagesStreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return MessagesErrorEvent(
          error = error,
          type = type,
          raw = raw,
        )
      }
    }
  }
}

internal object MessagesStreamEventsSerializer : KSerializer<MessagesStreamEvents> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): MessagesStreamEvents {
    val jsonDecoder = decoder.requireJsonDecoder("MessagesStreamEvents")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw MessagesStreamEventsNoMatchException("MessagesStreamEvents matched 0 branches: expected JSON object")
    val matches = inspectMessagesStreamEvents(rawObject)
    if (matches.size == 0) {
      throw MessagesStreamEventsNoMatchException("MessagesStreamEvents matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw MessagesStreamEventsAmbiguityException("MessagesStreamEvents matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.messagesStartEventMatches -> MessagesStreamEvents.MessagesStartEvent(message = requireNotNull(matches.message), type = requireNotNull(matches.typeState13), raw = rawObject)
      matches.messagesDeltaEventMatches -> MessagesStreamEvents.MessagesDeltaEvent(delta = requireNotNull(matches.deltaState2), type = requireNotNull(matches.typeState7), usage = requireNotNull(matches.usage), raw = rawObject)
      matches.messagesStopEventMatches -> MessagesStreamEvents.MessagesStopEvent(type = requireNotNull(matches.typeState15), raw = rawObject)
      matches.messagesContentBlockStartEventMatches -> MessagesStreamEvents.MessagesContentBlockStartEvent(contentBlock = requireNotNull(matches.contentBlock), index = requireNotNull(matches.index), type = requireNotNull(matches.typeState3), raw = rawObject)
      matches.messagesContentBlockDeltaEventMatches -> MessagesStreamEvents.MessagesContentBlockDeltaEvent(delta = requireNotNull(matches.deltaState1), index = requireNotNull(matches.index), type = requireNotNull(matches.typeState1), raw = rawObject)
      matches.messagesContentBlockStopEventMatches -> MessagesStreamEvents.MessagesContentBlockStopEvent(index = requireNotNull(matches.index), type = requireNotNull(matches.typeState5), raw = rawObject)
      matches.messagesPingEventMatches -> MessagesStreamEvents.MessagesPingEvent(type = requireNotNull(matches.typeState11), raw = rawObject)
      matches.messagesErrorEventMatches -> MessagesStreamEvents.MessagesErrorEvent(error = requireNotNull(matches.error), type = requireNotNull(matches.typeState9), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: MessagesStreamEvents) {
    encoder.requireJsonEncoder("MessagesStreamEvents").encodeJsonElement(value.raw)
  }
}

internal data class MessagesStreamEventsInspection(
  public val typeState13: InlineMessagesStartEventTypeX62ab7b72?,
  public val typeState13Decoded: Boolean,
  public val typeState13Matches: Boolean,
  public val message: InlineMessagesStartEventMessageX67927c6f?,
  public val messageDecoded: Boolean,
  public val typeState14: InlineMessagesStartEventTypeX62ab7b72?,
  public val typeState14Decoded: Boolean,
  public val typeState14Matches: Boolean,
  public val typeState7: InlineMessagesDeltaEventTypeXdd5f01d7?,
  public val typeState7Decoded: Boolean,
  public val typeState7Matches: Boolean,
  public val deltaState2: InlineMessagesDeltaEventDeltaXda39e6a6?,
  public val deltaState2Decoded: Boolean,
  public val typeState8: InlineMessagesDeltaEventTypeXdd5f01d7?,
  public val typeState8Decoded: Boolean,
  public val typeState8Matches: Boolean,
  public val usage: InlineMessagesDeltaEventUsageX9d3c9761?,
  public val usageDecoded: Boolean,
  public val typeState15: InlineMessagesStopEventTypeX456a472f?,
  public val typeState15Decoded: Boolean,
  public val typeState15Matches: Boolean,
  public val typeState16: InlineMessagesStopEventTypeX456a472f?,
  public val typeState16Decoded: Boolean,
  public val typeState16Matches: Boolean,
  public val typeState3: InlineMessagesContentBlockStartEventTypeXb466e0f5?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val contentBlock: InlineMessagesContentBlockStartEventContentBlockX89752283?,
  public val contentBlockDecoded: Boolean,
  public val index: Int?,
  public val indexDecoded: Boolean,
  public val typeState4: InlineMessagesContentBlockStartEventTypeXb466e0f5?,
  public val typeState4Decoded: Boolean,
  public val typeState4Matches: Boolean,
  public val typeState1: InlineMessagesContentBlockDeltaEventTypeXceafe8ab?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val deltaState1: InlineMessagesContentBlockDeltaEventDeltaX956b8ed8?,
  public val deltaState1Decoded: Boolean,
  public val typeState2: InlineMessagesContentBlockDeltaEventTypeXceafe8ab?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val typeState5: InlineMessagesContentBlockStopEventTypeXac1e8a22?,
  public val typeState5Decoded: Boolean,
  public val typeState5Matches: Boolean,
  public val typeState6: InlineMessagesContentBlockStopEventTypeXac1e8a22?,
  public val typeState6Decoded: Boolean,
  public val typeState6Matches: Boolean,
  public val typeState11: InlineMessagesPingEventTypeX731a5908?,
  public val typeState11Decoded: Boolean,
  public val typeState11Matches: Boolean,
  public val typeState12: InlineMessagesPingEventTypeX731a5908?,
  public val typeState12Decoded: Boolean,
  public val typeState12Matches: Boolean,
  public val typeState9: InlineMessagesErrorEventTypeX637de661?,
  public val typeState9Decoded: Boolean,
  public val typeState9Matches: Boolean,
  public val error: InlineMessagesErrorEventErrorX63070e5e?,
  public val errorDecoded: Boolean,
  public val typeState10: InlineMessagesErrorEventTypeX637de661?,
  public val typeState10Decoded: Boolean,
  public val typeState10Matches: Boolean,
  public val messagesStartEventMatches: Boolean,
  public val messagesDeltaEventMatches: Boolean,
  public val messagesStopEventMatches: Boolean,
  public val messagesContentBlockStartEventMatches: Boolean,
  public val messagesContentBlockDeltaEventMatches: Boolean,
  public val messagesContentBlockStopEventMatches: Boolean,
  public val messagesPingEventMatches: Boolean,
  public val messagesErrorEventMatches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (messagesStartEventMatches) add("MessagesStartEvent")
      if (messagesDeltaEventMatches) add("MessagesDeltaEvent")
      if (messagesStopEventMatches) add("MessagesStopEvent")
      if (messagesContentBlockStartEventMatches) add("MessagesContentBlockStartEvent")
      if (messagesContentBlockDeltaEventMatches) add("MessagesContentBlockDeltaEvent")
      if (messagesContentBlockStopEventMatches) add("MessagesContentBlockStopEvent")
      if (messagesPingEventMatches) add("MessagesPingEvent")
      if (messagesErrorEventMatches) add("MessagesErrorEvent")
    }

  public val size: Int
    get() = names.size
}

private fun inspectMessagesStreamEvents(rawObject: JsonObject): MessagesStreamEventsInspection {
  val typeState13Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesStartEventTypeX62ab7b72>(element) } }
  val typeState13 = typeState13Result?.getOrNull()
  val typeState13Decoded = typeState13Result?.isSuccess == true
  val typeState13Matches = (rawObject.stringValue("type") == "message_start") && typeState13Decoded
  val messageResult = rawObject["message"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesStartEventMessageX67927c6f>(element) } }
  val message = messageResult?.getOrNull()
  val messageDecoded = messageResult?.isSuccess == true
  val typeState14Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesStartEventTypeX62ab7b72>(element) } }
  val typeState14 = typeState14Result?.getOrNull()
  val typeState14Decoded = typeState14Result?.isSuccess == true
  val typeState14Matches = (rawObject.stringValue("type") == "message_start") && typeState14Decoded
  val typeState7Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesDeltaEventTypeXdd5f01d7>(element) } }
  val typeState7 = typeState7Result?.getOrNull()
  val typeState7Decoded = typeState7Result?.isSuccess == true
  val typeState7Matches = (rawObject.stringValue("type") == "message_delta") && typeState7Decoded
  val deltaState2Result = rawObject["delta"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesDeltaEventDeltaXda39e6a6>(element) } }
  val deltaState2 = deltaState2Result?.getOrNull()
  val deltaState2Decoded = deltaState2Result?.isSuccess == true
  val typeState8Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesDeltaEventTypeXdd5f01d7>(element) } }
  val typeState8 = typeState8Result?.getOrNull()
  val typeState8Decoded = typeState8Result?.isSuccess == true
  val typeState8Matches = (rawObject.stringValue("type") == "message_delta") && typeState8Decoded
  val usageResult = rawObject["usage"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesDeltaEventUsageX9d3c9761>(element) } }
  val usage = usageResult?.getOrNull()
  val usageDecoded = usageResult?.isSuccess == true
  val typeState15Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesStopEventTypeX456a472f>(element) } }
  val typeState15 = typeState15Result?.getOrNull()
  val typeState15Decoded = typeState15Result?.isSuccess == true
  val typeState15Matches = (rawObject.stringValue("type") == "message_stop") && typeState15Decoded
  val typeState16Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesStopEventTypeX456a472f>(element) } }
  val typeState16 = typeState16Result?.getOrNull()
  val typeState16Decoded = typeState16Result?.isSuccess == true
  val typeState16Matches = (rawObject.stringValue("type") == "message_stop") && typeState16Decoded
  val typeState3Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesContentBlockStartEventTypeXb466e0f5>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = (rawObject.stringValue("type") == "content_block_start") && typeState3Decoded
  val contentBlockResult = rawObject["content_block"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesContentBlockStartEventContentBlockX89752283>(element) } }
  val contentBlock = contentBlockResult?.getOrNull()
  val contentBlockDecoded = contentBlockResult?.isSuccess == true
  val indexResult = rawObject["index"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val index = indexResult?.getOrNull()
  val indexDecoded = indexResult?.isSuccess == true
  val typeState4Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesContentBlockStartEventTypeXb466e0f5>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val typeState4Matches = (rawObject.stringValue("type") == "content_block_start") && typeState4Decoded
  val typeState1Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesContentBlockDeltaEventTypeXceafe8ab>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = (rawObject.stringValue("type") == "content_block_delta") && typeState1Decoded
  val deltaState1Result = rawObject["delta"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesContentBlockDeltaEventDeltaX956b8ed8>(element) } }
  val deltaState1 = deltaState1Result?.getOrNull()
  val deltaState1Decoded = deltaState1Result?.isSuccess == true
  val typeState2Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesContentBlockDeltaEventTypeXceafe8ab>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = (rawObject.stringValue("type") == "content_block_delta") && typeState2Decoded
  val typeState5Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesContentBlockStopEventTypeXac1e8a22>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  val typeState5Matches = (rawObject.stringValue("type") == "content_block_stop") && typeState5Decoded
  val typeState6Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesContentBlockStopEventTypeXac1e8a22>(element) } }
  val typeState6 = typeState6Result?.getOrNull()
  val typeState6Decoded = typeState6Result?.isSuccess == true
  val typeState6Matches = (rawObject.stringValue("type") == "content_block_stop") && typeState6Decoded
  val typeState11Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesPingEventTypeX731a5908>(element) } }
  val typeState11 = typeState11Result?.getOrNull()
  val typeState11Decoded = typeState11Result?.isSuccess == true
  val typeState11Matches = (rawObject.stringValue("type") == "ping") && typeState11Decoded
  val typeState12Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesPingEventTypeX731a5908>(element) } }
  val typeState12 = typeState12Result?.getOrNull()
  val typeState12Decoded = typeState12Result?.isSuccess == true
  val typeState12Matches = (rawObject.stringValue("type") == "ping") && typeState12Decoded
  val typeState9Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesErrorEventTypeX637de661>(element) } }
  val typeState9 = typeState9Result?.getOrNull()
  val typeState9Decoded = typeState9Result?.isSuccess == true
  val typeState9Matches = (rawObject.stringValue("type") == "error") && typeState9Decoded
  val errorResult = rawObject["error"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesErrorEventErrorX63070e5e>(element) } }
  val error = errorResult?.getOrNull()
  val errorDecoded = errorResult?.isSuccess == true
  val typeState10Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesErrorEventTypeX637de661>(element) } }
  val typeState10 = typeState10Result?.getOrNull()
  val typeState10Decoded = typeState10Result?.isSuccess == true
  val typeState10Matches = (rawObject.stringValue("type") == "error") && typeState10Decoded
  val rawEmpty = rawObject.isEmpty()
  val messagesStartEventMatches = matchesMessagesStreamEventsMessagesStartEventBranch(rawObject) && (typeState13Matches)
  val messagesDeltaEventMatches = matchesMessagesStreamEventsMessagesDeltaEventBranch(rawObject) && (typeState7Matches)
  val messagesStopEventMatches = matchesMessagesStreamEventsMessagesStopEventBranch(rawObject) && (typeState15Matches)
  val messagesContentBlockStartEventMatches = matchesMessagesStreamEventsMessagesContentBlockStartEventBranch(rawObject) && (typeState3Matches)
  val messagesContentBlockDeltaEventMatches = matchesMessagesStreamEventsMessagesContentBlockDeltaEventBranch(rawObject) && (typeState1Matches)
  val messagesContentBlockStopEventMatches = matchesMessagesStreamEventsMessagesContentBlockStopEventBranch(rawObject) && (typeState5Matches)
  val messagesPingEventMatches = matchesMessagesStreamEventsMessagesPingEventBranch(rawObject) && (typeState11Matches)
  val messagesErrorEventMatches = matchesMessagesStreamEventsMessagesErrorEventBranch(rawObject) && (typeState9Matches)
  return MessagesStreamEventsInspection(
    typeState13 = typeState13,
    typeState13Decoded = typeState13Decoded,
    typeState13Matches = typeState13Matches,
    message = message,
    messageDecoded = messageDecoded,
    typeState14 = typeState14,
    typeState14Decoded = typeState14Decoded,
    typeState14Matches = typeState14Matches,
    typeState7 = typeState7,
    typeState7Decoded = typeState7Decoded,
    typeState7Matches = typeState7Matches,
    deltaState2 = deltaState2,
    deltaState2Decoded = deltaState2Decoded,
    typeState8 = typeState8,
    typeState8Decoded = typeState8Decoded,
    typeState8Matches = typeState8Matches,
    usage = usage,
    usageDecoded = usageDecoded,
    typeState15 = typeState15,
    typeState15Decoded = typeState15Decoded,
    typeState15Matches = typeState15Matches,
    typeState16 = typeState16,
    typeState16Decoded = typeState16Decoded,
    typeState16Matches = typeState16Matches,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    contentBlock = contentBlock,
    contentBlockDecoded = contentBlockDecoded,
    index = index,
    indexDecoded = indexDecoded,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    typeState4Matches = typeState4Matches,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    deltaState1 = deltaState1,
    deltaState1Decoded = deltaState1Decoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    typeState5 = typeState5,
    typeState5Decoded = typeState5Decoded,
    typeState5Matches = typeState5Matches,
    typeState6 = typeState6,
    typeState6Decoded = typeState6Decoded,
    typeState6Matches = typeState6Matches,
    typeState11 = typeState11,
    typeState11Decoded = typeState11Decoded,
    typeState11Matches = typeState11Matches,
    typeState12 = typeState12,
    typeState12Decoded = typeState12Decoded,
    typeState12Matches = typeState12Matches,
    typeState9 = typeState9,
    typeState9Decoded = typeState9Decoded,
    typeState9Matches = typeState9Matches,
    error = error,
    errorDecoded = errorDecoded,
    typeState10 = typeState10,
    typeState10Decoded = typeState10Decoded,
    typeState10Matches = typeState10Matches,
    messagesStartEventMatches = messagesStartEventMatches,
    messagesDeltaEventMatches = messagesDeltaEventMatches,
    messagesStopEventMatches = messagesStopEventMatches,
    messagesContentBlockStartEventMatches = messagesContentBlockStartEventMatches,
    messagesContentBlockDeltaEventMatches = messagesContentBlockDeltaEventMatches,
    messagesContentBlockStopEventMatches = messagesContentBlockStopEventMatches,
    messagesPingEventMatches = messagesPingEventMatches,
    messagesErrorEventMatches = messagesErrorEventMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!messagesStartEventMatches) add("MessagesStartEvent: branch predicate did not match properties 'type'")
      if (!messagesDeltaEventMatches) add("MessagesDeltaEvent: branch predicate did not match properties 'type'")
      if (!messagesStopEventMatches) add("MessagesStopEvent: branch predicate did not match properties 'type'")
      if (!messagesContentBlockStartEventMatches) add("MessagesContentBlockStartEvent: branch predicate did not match properties 'type'")
      if (!messagesContentBlockDeltaEventMatches) add("MessagesContentBlockDeltaEvent: branch predicate did not match properties 'type'")
      if (!messagesContentBlockStopEventMatches) add("MessagesContentBlockStopEvent: branch predicate did not match properties 'type'")
      if (!messagesPingEventMatches) add("MessagesPingEvent: branch predicate did not match properties 'type'")
      if (!messagesErrorEventMatches) add("MessagesErrorEvent: branch predicate did not match properties 'type'")
    },
  )
}

private fun matchesMessagesStreamEventsMessagesStartEventBranch(rawObject: JsonObject): Boolean = true

private fun matchesMessagesStreamEventsMessagesDeltaEventBranch(rawObject: JsonObject): Boolean = true

private fun matchesMessagesStreamEventsMessagesStopEventBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["openrouter_metadata"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("attempt") && (property as JsonObject).containsKey("endpoints") && (property as JsonObject).containsKey("is_byok") && (property as JsonObject).containsKey("region") && (property as JsonObject).containsKey("requested") && (property as JsonObject).containsKey("strategy") && (property as JsonObject).containsKey("summary") && ((property as JsonObject)["attempt"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((property as JsonObject)["attempts"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> (item is JsonObject && (item !is JsonObject || ((item as JsonObject).containsKey("model") && (item as JsonObject).containsKey("provider") && (item as JsonObject).containsKey("status") && ((item as JsonObject)["model"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["provider"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["status"]?.let { property -> property.isJsonSchemaInteger() } ?: true)))) }))) } ?: true) && ((property as JsonObject)["endpoints"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("available") && (property as JsonObject).containsKey("total") && ((property as JsonObject)["available"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> (item is JsonObject && (item !is JsonObject || ((item as JsonObject).containsKey("model") && (item as JsonObject).containsKey("provider") && (item as JsonObject).containsKey("selected") && ((item as JsonObject)["model"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["provider"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["selected"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true)))) }))) } ?: true) && ((property as JsonObject)["total"]?.let { property -> property.isJsonSchemaInteger() } ?: true)))) } ?: true) && ((property as JsonObject)["is_byok"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true) && ((property as JsonObject)["params"]?.let { property -> (property is JsonObject && (property !is JsonObject || (((property as JsonObject)["quality_floor"]?.let { property -> property.isJsonSchemaNumber() } ?: true) && ((property as JsonObject)["throughput_floor"]?.let { property -> property.isJsonSchemaNumber() } ?: true) && ((property as JsonObject)["version_group"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (property as JsonObject).all { (name, value) -> name in setOf<String>("quality_floor", "throughput_floor", "version_group") || true }))) } ?: true) && ((property as JsonObject)["pipeline"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> (item is JsonObject && (item !is JsonObject || ((item as JsonObject).containsKey("name") && (item as JsonObject).containsKey("type") && ((item as JsonObject)["cost_usd"]?.let { property -> property.isJsonSchemaNumber() } ?: true) && ((item as JsonObject)["data"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).all { (name, value) -> name in setOf<String>() || true }))) } ?: true) && ((item as JsonObject)["guardrail_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["guardrail_scope"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["name"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["summary"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"guardrail\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"plugin\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"server_tools\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response_healing\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"context_compression\"")))) } ?: true)))) }))) } ?: true) && ((property as JsonObject)["region"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["requested"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["strategy"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"direct\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"auto\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"free\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"latest\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"alias\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"fallback\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"pareto\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"bodybuilder\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"fusion\"")))) } ?: true) && ((property as JsonObject)["summary"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"message_stop\"")))) } ?: true))))

private fun matchesMessagesStreamEventsMessagesContentBlockStartEventBranch(rawObject: JsonObject): Boolean = true

private fun matchesMessagesStreamEventsMessagesContentBlockDeltaEventBranch(rawObject: JsonObject): Boolean = true

private fun matchesMessagesStreamEventsMessagesContentBlockStopEventBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("index") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"content_block_stop\"")))) } ?: true))))

private fun matchesMessagesStreamEventsMessagesPingEventBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"ping\"")))) } ?: true))))

private fun matchesMessagesStreamEventsMessagesErrorEventBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("error") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["error"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("message") && (property as JsonObject).containsKey("type") && ((property as JsonObject)["error_type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"context_length_exceeded\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"max_tokens_exceeded\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"token_limit_exceeded\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"string_too_long\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"authentication\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"permission_denied\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"payment_required\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"rate_limit_exceeded\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"provider_overloaded\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"provider_unavailable\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"invalid_request\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"invalid_prompt\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"not_found\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"precondition_failed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"payload_too_large\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"unprocessable\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"content_policy_violation\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"refusal\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"invalid_image\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"image_too_large\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"image_too_small\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"unsupported_image_format\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"image_not_found\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"image_download_failed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"server\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"timeout\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"unmapped\"")))) } ?: true) && ((property as JsonObject)["message"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["type"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) } ?: true) && ((rawObject as JsonObject)["openrouter_metadata"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("attempt") && (property as JsonObject).containsKey("endpoints") && (property as JsonObject).containsKey("is_byok") && (property as JsonObject).containsKey("region") && (property as JsonObject).containsKey("requested") && (property as JsonObject).containsKey("strategy") && (property as JsonObject).containsKey("summary") && ((property as JsonObject)["attempt"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((property as JsonObject)["attempts"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> (item is JsonObject && (item !is JsonObject || ((item as JsonObject).containsKey("model") && (item as JsonObject).containsKey("provider") && (item as JsonObject).containsKey("status") && ((item as JsonObject)["model"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["provider"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["status"]?.let { property -> property.isJsonSchemaInteger() } ?: true)))) }))) } ?: true) && ((property as JsonObject)["endpoints"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("available") && (property as JsonObject).containsKey("total") && ((property as JsonObject)["available"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> (item is JsonObject && (item !is JsonObject || ((item as JsonObject).containsKey("model") && (item as JsonObject).containsKey("provider") && (item as JsonObject).containsKey("selected") && ((item as JsonObject)["model"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["provider"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["selected"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true)))) }))) } ?: true) && ((property as JsonObject)["total"]?.let { property -> property.isJsonSchemaInteger() } ?: true)))) } ?: true) && ((property as JsonObject)["is_byok"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true) && ((property as JsonObject)["params"]?.let { property -> (property is JsonObject && (property !is JsonObject || (((property as JsonObject)["quality_floor"]?.let { property -> property.isJsonSchemaNumber() } ?: true) && ((property as JsonObject)["throughput_floor"]?.let { property -> property.isJsonSchemaNumber() } ?: true) && ((property as JsonObject)["version_group"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (property as JsonObject).all { (name, value) -> name in setOf<String>("quality_floor", "throughput_floor", "version_group") || true }))) } ?: true) && ((property as JsonObject)["pipeline"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> (item is JsonObject && (item !is JsonObject || ((item as JsonObject).containsKey("name") && (item as JsonObject).containsKey("type") && ((item as JsonObject)["cost_usd"]?.let { property -> property.isJsonSchemaNumber() } ?: true) && ((item as JsonObject)["data"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).all { (name, value) -> name in setOf<String>() || true }))) } ?: true) && ((item as JsonObject)["guardrail_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["guardrail_scope"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["name"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["summary"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"guardrail\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"plugin\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"server_tools\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response_healing\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"context_compression\"")))) } ?: true)))) }))) } ?: true) && ((property as JsonObject)["region"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["requested"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["strategy"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"direct\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"auto\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"free\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"latest\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"alias\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"fallback\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"pareto\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"bodybuilder\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"fusion\"")))) } ?: true) && ((property as JsonObject)["summary"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"error\"")))) } ?: true))))

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
