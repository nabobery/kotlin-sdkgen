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

public sealed class StreamEventsDecodingException(
  message: String,
) : SerializationException(message)

public class StreamEventsNoMatchException(
  message: String,
) : StreamEventsDecodingException(message)

public class StreamEventsAmbiguityException(
  message: String,
) : StreamEventsDecodingException(message)

public class StreamEventsBranchValidationException(
  message: String,
) : StreamEventsDecodingException(message)

/**
 * Union of all possible event types emitted during response streaming
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/StreamEvents
 */
@Serializable(with = StreamEventsSerializer::class)
public sealed interface StreamEvents {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class OpenResponsesCreatedEvent internal constructor(
    public val response: OpenResponsesResult,
    public val sequenceNumber: Int,
    public val type: InlineCreatedEventTypeX5df1e0b6,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        response: OpenResponsesResult,
        sequenceNumber: Int,
        type: InlineCreatedEventTypeX5df1e0b6,
      ): OpenResponsesCreatedEvent {
        val raw = buildJsonObject {
          put("response", SdkJson.encodeToJsonElement(response))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.openResponsesCreatedEventMatches) {
          throw StreamEventsBranchValidationException("OpenResponsesCreatedEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OpenResponsesCreatedEvent(
          response = response,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OpenResponsesInProgressEvent internal constructor(
    public val response: OpenResponsesResult,
    public val sequenceNumber: Int,
    public val type: InlineInProgressEventTypeX9cb33eb5,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        response: OpenResponsesResult,
        sequenceNumber: Int,
        type: InlineInProgressEventTypeX9cb33eb5,
      ): OpenResponsesInProgressEvent {
        val raw = buildJsonObject {
          put("response", SdkJson.encodeToJsonElement(response))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.openResponsesInProgressEventMatches) {
          throw StreamEventsBranchValidationException("OpenResponsesInProgressEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OpenResponsesInProgressEvent(
          response = response,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class StreamEventsResponseCompleted internal constructor(
    public val response: OpenResponsesResult,
    public val sequenceNumber: Int,
    public val type: InlineCompletedEventTypeXb615442a,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        response: OpenResponsesResult,
        sequenceNumber: Int,
        type: InlineCompletedEventTypeXb615442a,
      ): StreamEventsResponseCompleted {
        val raw = buildJsonObject {
          put("response", SdkJson.encodeToJsonElement(response))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.streamEventsResponseCompletedMatches) {
          throw StreamEventsBranchValidationException("StreamEventsResponseCompleted factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return StreamEventsResponseCompleted(
          response = response,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class StreamEventsResponseIncomplete internal constructor(
    public val response: OpenResponsesResult,
    public val sequenceNumber: Int,
    public val type: InlineIncompleteEventTypeX2a7bc849,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        response: OpenResponsesResult,
        sequenceNumber: Int,
        type: InlineIncompleteEventTypeX2a7bc849,
      ): StreamEventsResponseIncomplete {
        val raw = buildJsonObject {
          put("response", SdkJson.encodeToJsonElement(response))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.streamEventsResponseIncompleteMatches) {
          throw StreamEventsBranchValidationException("StreamEventsResponseIncomplete factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return StreamEventsResponseIncomplete(
          response = response,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class StreamEventsResponseFailed internal constructor(
    public val response: OpenResponsesResult,
    public val sequenceNumber: Int,
    public val type: InlineFailedEventTypeX5da253bb,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        response: OpenResponsesResult,
        sequenceNumber: Int,
        type: InlineFailedEventTypeX5da253bb,
      ): StreamEventsResponseFailed {
        val raw = buildJsonObject {
          put("response", SdkJson.encodeToJsonElement(response))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.streamEventsResponseFailedMatches) {
          throw StreamEventsBranchValidationException("StreamEventsResponseFailed factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return StreamEventsResponseFailed(
          response = response,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class ErrorEvent internal constructor(
    public val code: String?,
    public val message: String,
    public val `param`: String?,
    public val sequenceNumber: Int,
    public val type: InlineBaseErrorEventTypeXb81f86a5,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        code: String?,
        message: String,
        `param`: String?,
        sequenceNumber: Int,
        type: InlineBaseErrorEventTypeXb81f86a5,
      ): ErrorEvent {
        val raw = buildJsonObject {
          put("code", code)
          put("message", message)
          put("param", param)
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.errorEventMatches) {
          throw StreamEventsBranchValidationException("ErrorEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ErrorEvent(
          code = code,
          message = message,
          param = param,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class StreamEventsResponseOutputItemAdded internal constructor(
    public val item: OutputItems,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineOutputItemAddedEventTypeX285183a5,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        item: OutputItems,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineOutputItemAddedEventTypeX285183a5,
      ): StreamEventsResponseOutputItemAdded {
        val raw = buildJsonObject {
          put("item", SdkJson.encodeToJsonElement(item))
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.streamEventsResponseOutputItemAddedMatches) {
          throw StreamEventsBranchValidationException("StreamEventsResponseOutputItemAdded factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return StreamEventsResponseOutputItemAdded(
          item = item,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class StreamEventsResponseOutputItemDone internal constructor(
    public val item: OutputItems,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineOutputItemDoneEventTypeX3fc126fd,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        item: OutputItems,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineOutputItemDoneEventTypeX3fc126fd,
      ): StreamEventsResponseOutputItemDone {
        val raw = buildJsonObject {
          put("item", SdkJson.encodeToJsonElement(item))
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.streamEventsResponseOutputItemDoneMatches) {
          throw StreamEventsBranchValidationException("StreamEventsResponseOutputItemDone factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return StreamEventsResponseOutputItemDone(
          item = item,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class ContentPartAddedEvent internal constructor(
    public val contentIndex: Int,
    public val itemId: String,
    public val outputIndex: Int,
    public val part: InlineBaseContentPartAddedEventPartXe4ac1bd0,
    public val sequenceNumber: Int,
    public val type: InlineBaseContentPartAddedEventTypeXef1bd9f5,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        contentIndex: Int,
        itemId: String,
        outputIndex: Int,
        part: InlineBaseContentPartAddedEventPartXe4ac1bd0,
        sequenceNumber: Int,
        type: InlineBaseContentPartAddedEventTypeXef1bd9f5,
      ): ContentPartAddedEvent {
        val raw = buildJsonObject {
          put("content_index", SdkJson.encodeToJsonElement(contentIndex))
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("part", SdkJson.encodeToJsonElement(part))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.contentPartAddedEventMatches) {
          throw StreamEventsBranchValidationException("ContentPartAddedEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ContentPartAddedEvent(
          contentIndex = contentIndex,
          itemId = itemId,
          outputIndex = outputIndex,
          part = part,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class ContentPartDoneEvent internal constructor(
    public val contentIndex: Int,
    public val itemId: String,
    public val outputIndex: Int,
    public val part: InlineBaseContentPartDoneEventPartX9028e32f,
    public val sequenceNumber: Int,
    public val type: InlineBaseContentPartDoneEventTypeX449d5d90,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        contentIndex: Int,
        itemId: String,
        outputIndex: Int,
        part: InlineBaseContentPartDoneEventPartX9028e32f,
        sequenceNumber: Int,
        type: InlineBaseContentPartDoneEventTypeX449d5d90,
      ): ContentPartDoneEvent {
        val raw = buildJsonObject {
          put("content_index", SdkJson.encodeToJsonElement(contentIndex))
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("part", SdkJson.encodeToJsonElement(part))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.contentPartDoneEventMatches) {
          throw StreamEventsBranchValidationException("ContentPartDoneEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ContentPartDoneEvent(
          contentIndex = contentIndex,
          itemId = itemId,
          outputIndex = outputIndex,
          part = part,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class TextDeltaEvent internal constructor(
    public val contentIndex: Int,
    public val delta: String,
    public val itemId: String,
    logprobs: List<StreamLogprob>,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineBaseTextDeltaEventTypeX34a64077,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public val logprobs: List<StreamLogprob> = logprobs.toList()

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        contentIndex: Int,
        delta: String,
        itemId: String,
        logprobs: List<StreamLogprob>,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineBaseTextDeltaEventTypeX34a64077,
      ): TextDeltaEvent {
        val logprobsOwnershipSnapshot = logprobs.toList()
        val raw = buildJsonObject {
          put("content_index", SdkJson.encodeToJsonElement(contentIndex))
          put("delta", delta)
          put("item_id", itemId)
          put("logprobs", SdkJson.encodeToJsonElement(logprobsOwnershipSnapshot))
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.textDeltaEventMatches) {
          throw StreamEventsBranchValidationException("TextDeltaEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return TextDeltaEvent(
          contentIndex = contentIndex,
          delta = delta,
          itemId = itemId,
          logprobs = logprobsOwnershipSnapshot,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class TextDoneEvent internal constructor(
    public val contentIndex: Int,
    public val itemId: String,
    logprobs: List<StreamLogprob>,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val text: String,
    public val type: InlineBaseTextDoneEventTypeX0b2acb76,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public val logprobs: List<StreamLogprob> = logprobs.toList()

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        contentIndex: Int,
        itemId: String,
        logprobs: List<StreamLogprob>,
        outputIndex: Int,
        sequenceNumber: Int,
        text: String,
        type: InlineBaseTextDoneEventTypeX0b2acb76,
      ): TextDoneEvent {
        val logprobsOwnershipSnapshot = logprobs.toList()
        val raw = buildJsonObject {
          put("content_index", SdkJson.encodeToJsonElement(contentIndex))
          put("item_id", itemId)
          put("logprobs", SdkJson.encodeToJsonElement(logprobsOwnershipSnapshot))
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("text", text)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.textDoneEventMatches) {
          throw StreamEventsBranchValidationException("TextDoneEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return TextDoneEvent(
          contentIndex = contentIndex,
          itemId = itemId,
          logprobs = logprobsOwnershipSnapshot,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          text = text,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RefusalDeltaEvent internal constructor(
    public val contentIndex: Int,
    public val delta: String,
    public val itemId: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineBaseRefusalDeltaEventTypeX772b7e35,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        contentIndex: Int,
        delta: String,
        itemId: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineBaseRefusalDeltaEventTypeX772b7e35,
      ): RefusalDeltaEvent {
        val raw = buildJsonObject {
          put("content_index", SdkJson.encodeToJsonElement(contentIndex))
          put("delta", delta)
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.refusalDeltaEventMatches) {
          throw StreamEventsBranchValidationException("RefusalDeltaEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RefusalDeltaEvent(
          contentIndex = contentIndex,
          delta = delta,
          itemId = itemId,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RefusalDoneEvent internal constructor(
    public val contentIndex: Int,
    public val itemId: String,
    public val outputIndex: Int,
    public val refusal: String,
    public val sequenceNumber: Int,
    public val type: InlineBaseRefusalDoneEventTypeXdbf2b72d,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        contentIndex: Int,
        itemId: String,
        outputIndex: Int,
        refusal: String,
        sequenceNumber: Int,
        type: InlineBaseRefusalDoneEventTypeXdbf2b72d,
      ): RefusalDoneEvent {
        val raw = buildJsonObject {
          put("content_index", SdkJson.encodeToJsonElement(contentIndex))
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("refusal", refusal)
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.refusalDoneEventMatches) {
          throw StreamEventsBranchValidationException("RefusalDoneEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RefusalDoneEvent(
          contentIndex = contentIndex,
          itemId = itemId,
          outputIndex = outputIndex,
          refusal = refusal,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class AnnotationAddedEvent internal constructor(
    public val `annotation`: OpenAiResponsesAnnotation,
    public val annotationIndex: Int,
    public val contentIndex: Int,
    public val itemId: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineBaseAnnotationAddedEventTypeXbc690cd8,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        `annotation`: OpenAiResponsesAnnotation,
        annotationIndex: Int,
        contentIndex: Int,
        itemId: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineBaseAnnotationAddedEventTypeXbc690cd8,
      ): AnnotationAddedEvent {
        val raw = buildJsonObject {
          put("annotation", SdkJson.encodeToJsonElement(annotation))
          put("annotation_index", SdkJson.encodeToJsonElement(annotationIndex))
          put("content_index", SdkJson.encodeToJsonElement(contentIndex))
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.annotationAddedEventMatches) {
          throw StreamEventsBranchValidationException("AnnotationAddedEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AnnotationAddedEvent(
          annotation = annotation,
          annotationIndex = annotationIndex,
          contentIndex = contentIndex,
          itemId = itemId,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class FunctionCallArgsDeltaEvent internal constructor(
    public val delta: String,
    public val itemId: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineBaseFunctionCallArgsDeltaEventTypeXc0db7b97,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        delta: String,
        itemId: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineBaseFunctionCallArgsDeltaEventTypeXc0db7b97,
      ): FunctionCallArgsDeltaEvent {
        val raw = buildJsonObject {
          put("delta", delta)
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.functionCallArgsDeltaEventMatches) {
          throw StreamEventsBranchValidationException("FunctionCallArgsDeltaEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return FunctionCallArgsDeltaEvent(
          delta = delta,
          itemId = itemId,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class FunctionCallArgsDoneEvent internal constructor(
    public val arguments: String,
    public val itemId: String,
    public val name: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineBaseFunctionCallArgsDoneEventTypeX9fa9a477,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        arguments: String,
        itemId: String,
        name: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineBaseFunctionCallArgsDoneEventTypeX9fa9a477,
      ): FunctionCallArgsDoneEvent {
        val raw = buildJsonObject {
          put("arguments", arguments)
          put("item_id", itemId)
          put("name", name)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.functionCallArgsDoneEventMatches) {
          throw StreamEventsBranchValidationException("FunctionCallArgsDoneEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return FunctionCallArgsDoneEvent(
          arguments = arguments,
          itemId = itemId,
          name = name,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class ReasoningDeltaEvent internal constructor(
    public val contentIndex: Int,
    public val delta: String,
    public val itemId: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineBaseReasoningDeltaEventTypeX3eda767b,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        contentIndex: Int,
        delta: String,
        itemId: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineBaseReasoningDeltaEventTypeX3eda767b,
      ): ReasoningDeltaEvent {
        val raw = buildJsonObject {
          put("content_index", SdkJson.encodeToJsonElement(contentIndex))
          put("delta", delta)
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.reasoningDeltaEventMatches) {
          throw StreamEventsBranchValidationException("ReasoningDeltaEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ReasoningDeltaEvent(
          contentIndex = contentIndex,
          delta = delta,
          itemId = itemId,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class ReasoningDoneEvent internal constructor(
    public val contentIndex: Int,
    public val itemId: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val text: String,
    public val type: InlineBaseReasoningDoneEventTypeX1b6171f7,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        contentIndex: Int,
        itemId: String,
        outputIndex: Int,
        sequenceNumber: Int,
        text: String,
        type: InlineBaseReasoningDoneEventTypeX1b6171f7,
      ): ReasoningDoneEvent {
        val raw = buildJsonObject {
          put("content_index", SdkJson.encodeToJsonElement(contentIndex))
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("text", text)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.reasoningDoneEventMatches) {
          throw StreamEventsBranchValidationException("ReasoningDoneEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ReasoningDoneEvent(
          contentIndex = contentIndex,
          itemId = itemId,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          text = text,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class ReasoningSummaryPartAddedEvent internal constructor(
    public val itemId: String,
    public val outputIndex: Int,
    public val part: ReasoningSummaryText,
    public val sequenceNumber: Int,
    public val summaryIndex: Int,
    public val type: InlineBaseReasoningSummaryPartAddedEventTypeX94872cab,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        itemId: String,
        outputIndex: Int,
        part: ReasoningSummaryText,
        sequenceNumber: Int,
        summaryIndex: Int,
        type: InlineBaseReasoningSummaryPartAddedEventTypeX94872cab,
      ): ReasoningSummaryPartAddedEvent {
        val raw = buildJsonObject {
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("part", SdkJson.encodeToJsonElement(part))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("summary_index", SdkJson.encodeToJsonElement(summaryIndex))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.reasoningSummaryPartAddedEventMatches) {
          throw StreamEventsBranchValidationException("ReasoningSummaryPartAddedEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ReasoningSummaryPartAddedEvent(
          itemId = itemId,
          outputIndex = outputIndex,
          part = part,
          sequenceNumber = sequenceNumber,
          summaryIndex = summaryIndex,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class ReasoningSummaryPartDoneEvent internal constructor(
    public val itemId: String,
    public val outputIndex: Int,
    public val part: ReasoningSummaryText,
    public val sequenceNumber: Int,
    public val summaryIndex: Int,
    public val type: InlineBaseReasoningSummaryPartDoneEventTypeXddb16b1a,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        itemId: String,
        outputIndex: Int,
        part: ReasoningSummaryText,
        sequenceNumber: Int,
        summaryIndex: Int,
        type: InlineBaseReasoningSummaryPartDoneEventTypeXddb16b1a,
      ): ReasoningSummaryPartDoneEvent {
        val raw = buildJsonObject {
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("part", SdkJson.encodeToJsonElement(part))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("summary_index", SdkJson.encodeToJsonElement(summaryIndex))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.reasoningSummaryPartDoneEventMatches) {
          throw StreamEventsBranchValidationException("ReasoningSummaryPartDoneEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ReasoningSummaryPartDoneEvent(
          itemId = itemId,
          outputIndex = outputIndex,
          part = part,
          sequenceNumber = sequenceNumber,
          summaryIndex = summaryIndex,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class ReasoningSummaryTextDeltaEvent internal constructor(
    public val delta: String,
    public val itemId: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val summaryIndex: Int,
    public val type: InlineBaseReasoningSummaryTextDeltaEventTypeXf824160f,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        delta: String,
        itemId: String,
        outputIndex: Int,
        sequenceNumber: Int,
        summaryIndex: Int,
        type: InlineBaseReasoningSummaryTextDeltaEventTypeXf824160f,
      ): ReasoningSummaryTextDeltaEvent {
        val raw = buildJsonObject {
          put("delta", delta)
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("summary_index", SdkJson.encodeToJsonElement(summaryIndex))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.reasoningSummaryTextDeltaEventMatches) {
          throw StreamEventsBranchValidationException("ReasoningSummaryTextDeltaEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ReasoningSummaryTextDeltaEvent(
          delta = delta,
          itemId = itemId,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          summaryIndex = summaryIndex,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class ReasoningSummaryTextDoneEvent internal constructor(
    public val itemId: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val summaryIndex: Int,
    public val text: String,
    public val type: InlineBaseReasoningSummaryTextDoneEventTypeXe9871e5b,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        itemId: String,
        outputIndex: Int,
        sequenceNumber: Int,
        summaryIndex: Int,
        text: String,
        type: InlineBaseReasoningSummaryTextDoneEventTypeXe9871e5b,
      ): ReasoningSummaryTextDoneEvent {
        val raw = buildJsonObject {
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("summary_index", SdkJson.encodeToJsonElement(summaryIndex))
          put("text", text)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.reasoningSummaryTextDoneEventMatches) {
          throw StreamEventsBranchValidationException("ReasoningSummaryTextDoneEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ReasoningSummaryTextDoneEvent(
          itemId = itemId,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          summaryIndex = summaryIndex,
          text = text,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class ImageGenCallInProgressEvent internal constructor(
    public val itemId: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineOpenAiResponsesImageGenCallInProgressTypeX00a42579,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        itemId: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineOpenAiResponsesImageGenCallInProgressTypeX00a42579,
      ): ImageGenCallInProgressEvent {
        val raw = buildJsonObject {
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.imageGenCallInProgressEventMatches) {
          throw StreamEventsBranchValidationException("ImageGenCallInProgressEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ImageGenCallInProgressEvent(
          itemId = itemId,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class ImageGenCallGeneratingEvent internal constructor(
    public val itemId: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineOpenAiResponsesImageGenCallGeneratingTypeX681fb2aa,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        itemId: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineOpenAiResponsesImageGenCallGeneratingTypeX681fb2aa,
      ): ImageGenCallGeneratingEvent {
        val raw = buildJsonObject {
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.imageGenCallGeneratingEventMatches) {
          throw StreamEventsBranchValidationException("ImageGenCallGeneratingEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ImageGenCallGeneratingEvent(
          itemId = itemId,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class ImageGenCallPartialImageEvent internal constructor(
    public val itemId: String,
    public val outputIndex: Int,
    public val partialImageB64: String,
    public val partialImageIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineOpenAiResponsesImageGenCallPartialImageTypeXf8c47cdf,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        itemId: String,
        outputIndex: Int,
        partialImageB64: String,
        partialImageIndex: Int,
        sequenceNumber: Int,
        type: InlineOpenAiResponsesImageGenCallPartialImageTypeXf8c47cdf,
      ): ImageGenCallPartialImageEvent {
        val raw = buildJsonObject {
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("partial_image_b64", partialImageB64)
          put("partial_image_index", SdkJson.encodeToJsonElement(partialImageIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.imageGenCallPartialImageEventMatches) {
          throw StreamEventsBranchValidationException("ImageGenCallPartialImageEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ImageGenCallPartialImageEvent(
          itemId = itemId,
          outputIndex = outputIndex,
          partialImageB64 = partialImageB64,
          partialImageIndex = partialImageIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class ImageGenCallCompletedEvent internal constructor(
    public val itemId: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineOpenAiResponsesImageGenCallCompletedTypeX22f05767,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        itemId: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineOpenAiResponsesImageGenCallCompletedTypeX22f05767,
      ): ImageGenCallCompletedEvent {
        val raw = buildJsonObject {
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.imageGenCallCompletedEventMatches) {
          throw StreamEventsBranchValidationException("ImageGenCallCompletedEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ImageGenCallCompletedEvent(
          itemId = itemId,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class WebSearchCallInProgressEvent internal constructor(
    public val itemId: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineOpenAiResponsesWebSearchCallInProgressTypeX435e8287,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        itemId: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineOpenAiResponsesWebSearchCallInProgressTypeX435e8287,
      ): WebSearchCallInProgressEvent {
        val raw = buildJsonObject {
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.webSearchCallInProgressEventMatches) {
          throw StreamEventsBranchValidationException("WebSearchCallInProgressEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return WebSearchCallInProgressEvent(
          itemId = itemId,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class WebSearchCallSearchingEvent internal constructor(
    public val itemId: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineOpenAiResponsesWebSearchCallSearchingTypeXffe34362,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        itemId: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineOpenAiResponsesWebSearchCallSearchingTypeXffe34362,
      ): WebSearchCallSearchingEvent {
        val raw = buildJsonObject {
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.webSearchCallSearchingEventMatches) {
          throw StreamEventsBranchValidationException("WebSearchCallSearchingEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return WebSearchCallSearchingEvent(
          itemId = itemId,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class WebSearchCallCompletedEvent internal constructor(
    public val itemId: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineOpenAiResponsesSearchCompletedTypeXbbabb05c,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        itemId: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineOpenAiResponsesSearchCompletedTypeXbbabb05c,
      ): WebSearchCallCompletedEvent {
        val raw = buildJsonObject {
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.webSearchCallCompletedEventMatches) {
          throw StreamEventsBranchValidationException("WebSearchCallCompletedEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return WebSearchCallCompletedEvent(
          itemId = itemId,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class CustomToolCallInputDeltaEvent internal constructor(
    public val delta: String,
    public val itemId: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineBaseCustomToolCallInputDeltaEventTypeXce45a844,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        delta: String,
        itemId: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineBaseCustomToolCallInputDeltaEventTypeXce45a844,
      ): CustomToolCallInputDeltaEvent {
        val raw = buildJsonObject {
          put("delta", delta)
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.customToolCallInputDeltaEventMatches) {
          throw StreamEventsBranchValidationException("CustomToolCallInputDeltaEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return CustomToolCallInputDeltaEvent(
          delta = delta,
          itemId = itemId,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class CustomToolCallInputDoneEvent internal constructor(
    public val input: String,
    public val itemId: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineBaseCustomToolCallInputDoneEventTypeX61c85e37,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        input: String,
        itemId: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineBaseCustomToolCallInputDoneEventTypeX61c85e37,
      ): CustomToolCallInputDoneEvent {
        val raw = buildJsonObject {
          put("input", input)
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.customToolCallInputDoneEventMatches) {
          throw StreamEventsBranchValidationException("CustomToolCallInputDoneEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return CustomToolCallInputDoneEvent(
          input = input,
          itemId = itemId,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class ApplyPatchCallOperationDiffDeltaEvent internal constructor(
    public val delta: String,
    public val itemId: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineApplyPatchCallOperationDiffDeltaEventTypeX2a517bb3,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        delta: String,
        itemId: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineApplyPatchCallOperationDiffDeltaEventTypeX2a517bb3,
      ): ApplyPatchCallOperationDiffDeltaEvent {
        val raw = buildJsonObject {
          put("delta", delta)
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.applyPatchCallOperationDiffDeltaEventMatches) {
          throw StreamEventsBranchValidationException("ApplyPatchCallOperationDiffDeltaEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ApplyPatchCallOperationDiffDeltaEvent(
          delta = delta,
          itemId = itemId,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class ApplyPatchCallOperationDiffDoneEvent internal constructor(
    public val diff: String,
    public val itemId: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineApplyPatchCallOperationDiffDoneEventTypeX82fcb82d,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        diff: String,
        itemId: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineApplyPatchCallOperationDiffDoneEventTypeX82fcb82d,
      ): ApplyPatchCallOperationDiffDoneEvent {
        val raw = buildJsonObject {
          put("diff", diff)
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.applyPatchCallOperationDiffDoneEventMatches) {
          throw StreamEventsBranchValidationException("ApplyPatchCallOperationDiffDoneEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ApplyPatchCallOperationDiffDoneEvent(
          diff = diff,
          itemId = itemId,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class FusionCallInProgressEvent internal constructor(
    public val itemId: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineFusionCallInProgressEventTypeXd4ded992,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        itemId: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineFusionCallInProgressEventTypeXd4ded992,
      ): FusionCallInProgressEvent {
        val raw = buildJsonObject {
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.fusionCallInProgressEventMatches) {
          throw StreamEventsBranchValidationException("FusionCallInProgressEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return FusionCallInProgressEvent(
          itemId = itemId,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class FusionCallPanelAddedEvent internal constructor(
    public val itemId: String,
    public val model: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineFusionCallPanelAddedEventTypeXa7e7b6c6,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        itemId: String,
        model: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineFusionCallPanelAddedEventTypeXa7e7b6c6,
      ): FusionCallPanelAddedEvent {
        val raw = buildJsonObject {
          put("item_id", itemId)
          put("model", model)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.fusionCallPanelAddedEventMatches) {
          throw StreamEventsBranchValidationException("FusionCallPanelAddedEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return FusionCallPanelAddedEvent(
          itemId = itemId,
          model = model,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class FusionCallPanelDeltaEvent internal constructor(
    public val delta: String,
    public val itemId: String,
    public val model: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineFusionCallPanelDeltaEventTypeX8bdec444,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        delta: String,
        itemId: String,
        model: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineFusionCallPanelDeltaEventTypeX8bdec444,
      ): FusionCallPanelDeltaEvent {
        val raw = buildJsonObject {
          put("delta", delta)
          put("item_id", itemId)
          put("model", model)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.fusionCallPanelDeltaEventMatches) {
          throw StreamEventsBranchValidationException("FusionCallPanelDeltaEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return FusionCallPanelDeltaEvent(
          delta = delta,
          itemId = itemId,
          model = model,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class FusionCallPanelReasoningDeltaEvent internal constructor(
    public val delta: String,
    public val itemId: String,
    public val model: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineFusionCallPanelReasoningDeltaEventTypeX6c55d981,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        delta: String,
        itemId: String,
        model: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineFusionCallPanelReasoningDeltaEventTypeX6c55d981,
      ): FusionCallPanelReasoningDeltaEvent {
        val raw = buildJsonObject {
          put("delta", delta)
          put("item_id", itemId)
          put("model", model)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.fusionCallPanelReasoningDeltaEventMatches) {
          throw StreamEventsBranchValidationException("FusionCallPanelReasoningDeltaEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return FusionCallPanelReasoningDeltaEvent(
          delta = delta,
          itemId = itemId,
          model = model,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class FusionCallPanelCompletedEvent internal constructor(
    public val content: String,
    public val itemId: String,
    public val model: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineFusionCallPanelCompletedEventTypeXccd0e5e6,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        content: String,
        itemId: String,
        model: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineFusionCallPanelCompletedEventTypeXccd0e5e6,
      ): FusionCallPanelCompletedEvent {
        val raw = buildJsonObject {
          put("content", content)
          put("item_id", itemId)
          put("model", model)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.fusionCallPanelCompletedEventMatches) {
          throw StreamEventsBranchValidationException("FusionCallPanelCompletedEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return FusionCallPanelCompletedEvent(
          content = content,
          itemId = itemId,
          model = model,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class FusionCallPanelFailedEvent internal constructor(
    public val error: String,
    public val itemId: String,
    public val model: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineFusionCallPanelFailedEventTypeXf84539ef,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        error: String,
        itemId: String,
        model: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineFusionCallPanelFailedEventTypeXf84539ef,
      ): FusionCallPanelFailedEvent {
        val raw = buildJsonObject {
          put("error", error)
          put("item_id", itemId)
          put("model", model)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.fusionCallPanelFailedEventMatches) {
          throw StreamEventsBranchValidationException("FusionCallPanelFailedEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return FusionCallPanelFailedEvent(
          error = error,
          itemId = itemId,
          model = model,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class FusionCallAnalysisInProgressEvent internal constructor(
    public val itemId: String,
    public val judgeModel: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineFusionCallAnalysisInProgressEventTypeX56870346,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        itemId: String,
        judgeModel: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineFusionCallAnalysisInProgressEventTypeX56870346,
      ): FusionCallAnalysisInProgressEvent {
        val raw = buildJsonObject {
          put("item_id", itemId)
          put("judge_model", judgeModel)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.fusionCallAnalysisInProgressEventMatches) {
          throw StreamEventsBranchValidationException("FusionCallAnalysisInProgressEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return FusionCallAnalysisInProgressEvent(
          itemId = itemId,
          judgeModel = judgeModel,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class FusionCallAnalysisCompletedEvent internal constructor(
    public val analysis: FusionAnalysisResult,
    public val itemId: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineFusionCallAnalysisCompletedEventTypeX2230fa92,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        analysis: FusionAnalysisResult,
        itemId: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineFusionCallAnalysisCompletedEventTypeX2230fa92,
      ): FusionCallAnalysisCompletedEvent {
        val raw = buildJsonObject {
          put("analysis", SdkJson.encodeToJsonElement(analysis))
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.fusionCallAnalysisCompletedEventMatches) {
          throw StreamEventsBranchValidationException("FusionCallAnalysisCompletedEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return FusionCallAnalysisCompletedEvent(
          analysis = analysis,
          itemId = itemId,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class FusionCallCompletedEvent internal constructor(
    public val itemId: String,
    public val outputIndex: Int,
    public val sequenceNumber: Int,
    public val type: InlineFusionCallCompletedEventTypeX098a1518,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        itemId: String,
        outputIndex: Int,
        sequenceNumber: Int,
        type: InlineFusionCallCompletedEventTypeX098a1518,
      ): FusionCallCompletedEvent {
        val raw = buildJsonObject {
          put("item_id", itemId)
          put("output_index", SdkJson.encodeToJsonElement(outputIndex))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.fusionCallCompletedEventMatches) {
          throw StreamEventsBranchValidationException("FusionCallCompletedEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return FusionCallCompletedEvent(
          itemId = itemId,
          outputIndex = outputIndex,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class DebugEvent internal constructor(
    public val debug: InlineDebugEventDebugX52571c89,
    public val sequenceNumber: Int,
    public val type: InlineDebugEventTypeX9f7f544d,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : StreamEvents {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        debug: InlineDebugEventDebugX52571c89,
        sequenceNumber: Int,
        type: InlineDebugEventTypeX9f7f544d,
      ): DebugEvent {
        val raw = buildJsonObject {
          put("debug", SdkJson.encodeToJsonElement(debug))
          put("sequence_number", SdkJson.encodeToJsonElement(sequenceNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectStreamEvents(raw)
        if (inspection.size == 0) {
          throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.debugEventMatches) {
          throw StreamEventsBranchValidationException("DebugEvent factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw StreamEventsAmbiguityException("StreamEvents matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return DebugEvent(
          debug = debug,
          sequenceNumber = sequenceNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }
}

internal object StreamEventsSerializer : KSerializer<StreamEvents> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): StreamEvents {
    val jsonDecoder = decoder.requireJsonDecoder("StreamEvents")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw StreamEventsNoMatchException("StreamEvents matched 0 branches: expected JSON object")
    val matches = inspectStreamEvents(rawObject)
    if (matches.size == 0) {
      throw StreamEventsNoMatchException("StreamEvents matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw StreamEventsAmbiguityException("StreamEvents matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.openResponsesCreatedEventMatches -> StreamEvents.OpenResponsesCreatedEvent(response = requireNotNull(matches.response), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState43), raw = rawObject)
      matches.openResponsesInProgressEventMatches -> StreamEvents.OpenResponsesInProgressEvent(response = requireNotNull(matches.response), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState67), raw = rawObject)
      matches.streamEventsResponseCompletedMatches -> StreamEvents.StreamEventsResponseCompleted(response = requireNotNull(matches.response), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState41), raw = rawObject)
      matches.streamEventsResponseIncompleteMatches -> StreamEvents.StreamEventsResponseIncomplete(response = requireNotNull(matches.response), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState69), raw = rawObject)
      matches.streamEventsResponseFailedMatches -> StreamEvents.StreamEventsResponseFailed(response = requireNotNull(matches.response), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState47), raw = rawObject)
      matches.errorEventMatches -> StreamEvents.ErrorEvent(code = matches.code, message = requireNotNull(matches.message), param = matches.param, sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState15), raw = rawObject)
      matches.streamEventsResponseOutputItemAddedMatches -> StreamEvents.StreamEventsResponseOutputItemAdded(item = requireNotNull(matches.item), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState85), raw = rawObject)
      matches.streamEventsResponseOutputItemDoneMatches -> StreamEvents.StreamEventsResponseOutputItemDone(item = requireNotNull(matches.item), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState87), raw = rawObject)
      matches.contentPartAddedEventMatches -> StreamEvents.ContentPartAddedEvent(contentIndex = requireNotNull(matches.contentIndex), itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), part = requireNotNull(matches.partState1), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState7), raw = rawObject)
      matches.contentPartDoneEventMatches -> StreamEvents.ContentPartDoneEvent(contentIndex = requireNotNull(matches.contentIndex), itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), part = requireNotNull(matches.partState2), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState9), raw = rawObject)
      matches.textDeltaEventMatches -> StreamEvents.TextDeltaEvent(contentIndex = requireNotNull(matches.contentIndex), delta = requireNotNull(matches.delta), itemId = requireNotNull(matches.itemId), logprobs = requireNotNull(matches.logprobs), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState37), raw = rawObject)
      matches.textDoneEventMatches -> StreamEvents.TextDoneEvent(contentIndex = requireNotNull(matches.contentIndex), itemId = requireNotNull(matches.itemId), logprobs = requireNotNull(matches.logprobs), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), text = requireNotNull(matches.text), type = requireNotNull(matches.typeState39), raw = rawObject)
      matches.refusalDeltaEventMatches -> StreamEvents.RefusalDeltaEvent(contentIndex = requireNotNull(matches.contentIndex), delta = requireNotNull(matches.delta), itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState33), raw = rawObject)
      matches.refusalDoneEventMatches -> StreamEvents.RefusalDoneEvent(contentIndex = requireNotNull(matches.contentIndex), itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), refusal = requireNotNull(matches.refusal), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState35), raw = rawObject)
      matches.annotationAddedEventMatches -> StreamEvents.AnnotationAddedEvent(annotation = requireNotNull(matches.annotation), annotationIndex = requireNotNull(matches.annotationIndex), contentIndex = requireNotNull(matches.contentIndex), itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState5), raw = rawObject)
      matches.functionCallArgsDeltaEventMatches -> StreamEvents.FunctionCallArgsDeltaEvent(delta = requireNotNull(matches.delta), itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState17), raw = rawObject)
      matches.functionCallArgsDoneEventMatches -> StreamEvents.FunctionCallArgsDoneEvent(arguments = requireNotNull(matches.arguments), itemId = requireNotNull(matches.itemId), name = requireNotNull(matches.name), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState19), raw = rawObject)
      matches.reasoningDeltaEventMatches -> StreamEvents.ReasoningDeltaEvent(contentIndex = requireNotNull(matches.contentIndex), delta = requireNotNull(matches.delta), itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState21), raw = rawObject)
      matches.reasoningDoneEventMatches -> StreamEvents.ReasoningDoneEvent(contentIndex = requireNotNull(matches.contentIndex), itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), text = requireNotNull(matches.text), type = requireNotNull(matches.typeState23), raw = rawObject)
      matches.reasoningSummaryPartAddedEventMatches -> StreamEvents.ReasoningSummaryPartAddedEvent(itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), part = requireNotNull(matches.partState3), sequenceNumber = requireNotNull(matches.sequenceNumber), summaryIndex = requireNotNull(matches.summaryIndex), type = requireNotNull(matches.typeState25), raw = rawObject)
      matches.reasoningSummaryPartDoneEventMatches -> StreamEvents.ReasoningSummaryPartDoneEvent(itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), part = requireNotNull(matches.partState3), sequenceNumber = requireNotNull(matches.sequenceNumber), summaryIndex = requireNotNull(matches.summaryIndex), type = requireNotNull(matches.typeState27), raw = rawObject)
      matches.reasoningSummaryTextDeltaEventMatches -> StreamEvents.ReasoningSummaryTextDeltaEvent(delta = requireNotNull(matches.delta), itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), summaryIndex = requireNotNull(matches.summaryIndex), type = requireNotNull(matches.typeState29), raw = rawObject)
      matches.reasoningSummaryTextDoneEventMatches -> StreamEvents.ReasoningSummaryTextDoneEvent(itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), summaryIndex = requireNotNull(matches.summaryIndex), text = requireNotNull(matches.text), type = requireNotNull(matches.typeState31), raw = rawObject)
      matches.imageGenCallInProgressEventMatches -> StreamEvents.ImageGenCallInProgressEvent(itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState75), raw = rawObject)
      matches.imageGenCallGeneratingEventMatches -> StreamEvents.ImageGenCallGeneratingEvent(itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState73), raw = rawObject)
      matches.imageGenCallPartialImageEventMatches -> StreamEvents.ImageGenCallPartialImageEvent(itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), partialImageB64 = requireNotNull(matches.partialImageB64), partialImageIndex = requireNotNull(matches.partialImageIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState77), raw = rawObject)
      matches.imageGenCallCompletedEventMatches -> StreamEvents.ImageGenCallCompletedEvent(itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState71), raw = rawObject)
      matches.webSearchCallInProgressEventMatches -> StreamEvents.WebSearchCallInProgressEvent(itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState81), raw = rawObject)
      matches.webSearchCallSearchingEventMatches -> StreamEvents.WebSearchCallSearchingEvent(itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState83), raw = rawObject)
      matches.webSearchCallCompletedEventMatches -> StreamEvents.WebSearchCallCompletedEvent(itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState79), raw = rawObject)
      matches.customToolCallInputDeltaEventMatches -> StreamEvents.CustomToolCallInputDeltaEvent(delta = requireNotNull(matches.delta), itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState11), raw = rawObject)
      matches.customToolCallInputDoneEventMatches -> StreamEvents.CustomToolCallInputDoneEvent(input = requireNotNull(matches.input), itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState13), raw = rawObject)
      matches.applyPatchCallOperationDiffDeltaEventMatches -> StreamEvents.ApplyPatchCallOperationDiffDeltaEvent(delta = requireNotNull(matches.delta), itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState1), raw = rawObject)
      matches.applyPatchCallOperationDiffDoneEventMatches -> StreamEvents.ApplyPatchCallOperationDiffDoneEvent(diff = requireNotNull(matches.diff), itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState3), raw = rawObject)
      matches.fusionCallInProgressEventMatches -> StreamEvents.FusionCallInProgressEvent(itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState55), raw = rawObject)
      matches.fusionCallPanelAddedEventMatches -> StreamEvents.FusionCallPanelAddedEvent(itemId = requireNotNull(matches.itemId), model = requireNotNull(matches.model), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState57), raw = rawObject)
      matches.fusionCallPanelDeltaEventMatches -> StreamEvents.FusionCallPanelDeltaEvent(delta = requireNotNull(matches.delta), itemId = requireNotNull(matches.itemId), model = requireNotNull(matches.model), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState61), raw = rawObject)
      matches.fusionCallPanelReasoningDeltaEventMatches -> StreamEvents.FusionCallPanelReasoningDeltaEvent(delta = requireNotNull(matches.delta), itemId = requireNotNull(matches.itemId), model = requireNotNull(matches.model), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState65), raw = rawObject)
      matches.fusionCallPanelCompletedEventMatches -> StreamEvents.FusionCallPanelCompletedEvent(content = requireNotNull(matches.content), itemId = requireNotNull(matches.itemId), model = requireNotNull(matches.model), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState59), raw = rawObject)
      matches.fusionCallPanelFailedEventMatches -> StreamEvents.FusionCallPanelFailedEvent(error = requireNotNull(matches.error), itemId = requireNotNull(matches.itemId), model = requireNotNull(matches.model), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState63), raw = rawObject)
      matches.fusionCallAnalysisInProgressEventMatches -> StreamEvents.FusionCallAnalysisInProgressEvent(itemId = requireNotNull(matches.itemId), judgeModel = requireNotNull(matches.judgeModel), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState51), raw = rawObject)
      matches.fusionCallAnalysisCompletedEventMatches -> StreamEvents.FusionCallAnalysisCompletedEvent(analysis = requireNotNull(matches.analysis), itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState49), raw = rawObject)
      matches.fusionCallCompletedEventMatches -> StreamEvents.FusionCallCompletedEvent(itemId = requireNotNull(matches.itemId), outputIndex = requireNotNull(matches.outputIndex), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState53), raw = rawObject)
      matches.debugEventMatches -> StreamEvents.DebugEvent(debug = requireNotNull(matches.debug), sequenceNumber = requireNotNull(matches.sequenceNumber), type = requireNotNull(matches.typeState45), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: StreamEvents) {
    encoder.requireJsonEncoder("StreamEvents").encodeJsonElement(value.raw)
  }
}

internal class StreamEventsInspection {
  internal var typeState43: InlineCreatedEventTypeX5df1e0b6? = null

  internal var typeState43Decoded: Boolean = false

  internal var typeState43Matches: Boolean = false

  internal var response: OpenResponsesResult? = null

  internal var responseDecoded: Boolean = false

  internal var sequenceNumber: Int? = null

  internal var sequenceNumberDecoded: Boolean = false

  internal var typeState44: InlineCreatedEventTypeX5df1e0b6? = null

  internal var typeState44Decoded: Boolean = false

  internal var typeState44Matches: Boolean = false

  internal var typeState67: InlineInProgressEventTypeX9cb33eb5? = null

  internal var typeState67Decoded: Boolean = false

  internal var typeState67Matches: Boolean = false

  internal var typeState68: InlineInProgressEventTypeX9cb33eb5? = null

  internal var typeState68Decoded: Boolean = false

  internal var typeState68Matches: Boolean = false

  internal var typeState41: InlineCompletedEventTypeXb615442a? = null

  internal var typeState41Decoded: Boolean = false

  internal var typeState41Matches: Boolean = false

  internal var typeState42: InlineCompletedEventTypeXb615442a? = null

  internal var typeState42Decoded: Boolean = false

  internal var typeState42Matches: Boolean = false

  internal var typeState69: InlineIncompleteEventTypeX2a7bc849? = null

  internal var typeState69Decoded: Boolean = false

  internal var typeState69Matches: Boolean = false

  internal var typeState70: InlineIncompleteEventTypeX2a7bc849? = null

  internal var typeState70Decoded: Boolean = false

  internal var typeState70Matches: Boolean = false

  internal var typeState47: InlineFailedEventTypeX5da253bb? = null

  internal var typeState47Decoded: Boolean = false

  internal var typeState47Matches: Boolean = false

  internal var typeState48: InlineFailedEventTypeX5da253bb? = null

  internal var typeState48Decoded: Boolean = false

  internal var typeState48Matches: Boolean = false

  internal var typeState15: InlineBaseErrorEventTypeXb81f86a5? = null

  internal var typeState15Decoded: Boolean = false

  internal var typeState15Matches: Boolean = false

  internal var code: String? = null

  internal var codePresent: Boolean = false

  internal var codeDecoded: Boolean = false

  internal var message: String? = null

  internal var messageDecoded: Boolean = false

  internal var `param`: String? = null

  internal var paramPresent: Boolean = false

  internal var paramDecoded: Boolean = false

  internal var typeState16: InlineBaseErrorEventTypeXb81f86a5? = null

  internal var typeState16Decoded: Boolean = false

  internal var typeState16Matches: Boolean = false

  internal var typeState85: InlineOutputItemAddedEventTypeX285183a5? = null

  internal var typeState85Decoded: Boolean = false

  internal var typeState85Matches: Boolean = false

  internal var item: OutputItems? = null

  internal var itemDecoded: Boolean = false

  internal var outputIndex: Int? = null

  internal var outputIndexDecoded: Boolean = false

  internal var typeState86: InlineOutputItemAddedEventTypeX285183a5? = null

  internal var typeState86Decoded: Boolean = false

  internal var typeState86Matches: Boolean = false

  internal var typeState87: InlineOutputItemDoneEventTypeX3fc126fd? = null

  internal var typeState87Decoded: Boolean = false

  internal var typeState87Matches: Boolean = false

  internal var typeState88: InlineOutputItemDoneEventTypeX3fc126fd? = null

  internal var typeState88Decoded: Boolean = false

  internal var typeState88Matches: Boolean = false

  internal var typeState7: InlineBaseContentPartAddedEventTypeXef1bd9f5? = null

  internal var typeState7Decoded: Boolean = false

  internal var typeState7Matches: Boolean = false

  internal var contentIndex: Int? = null

  internal var contentIndexDecoded: Boolean = false

  internal var itemId: String? = null

  internal var itemIdDecoded: Boolean = false

  internal var partState1: InlineBaseContentPartAddedEventPartXe4ac1bd0? = null

  internal var partState1Decoded: Boolean = false

  internal var typeState8: InlineBaseContentPartAddedEventTypeXef1bd9f5? = null

  internal var typeState8Decoded: Boolean = false

  internal var typeState8Matches: Boolean = false

  internal var typeState9: InlineBaseContentPartDoneEventTypeX449d5d90? = null

  internal var typeState9Decoded: Boolean = false

  internal var typeState9Matches: Boolean = false

  internal var partState2: InlineBaseContentPartDoneEventPartX9028e32f? = null

  internal var partState2Decoded: Boolean = false

  internal var typeState10: InlineBaseContentPartDoneEventTypeX449d5d90? = null

  internal var typeState10Decoded: Boolean = false

  internal var typeState10Matches: Boolean = false

  internal var typeState37: InlineBaseTextDeltaEventTypeX34a64077? = null

  internal var typeState37Decoded: Boolean = false

  internal var typeState37Matches: Boolean = false

  internal var delta: String? = null

  internal var deltaDecoded: Boolean = false

  internal var logprobs: List<StreamLogprob>? = null

  internal var logprobsDecoded: Boolean = false

  internal var typeState38: InlineBaseTextDeltaEventTypeX34a64077? = null

  internal var typeState38Decoded: Boolean = false

  internal var typeState38Matches: Boolean = false

  internal var typeState39: InlineBaseTextDoneEventTypeX0b2acb76? = null

  internal var typeState39Decoded: Boolean = false

  internal var typeState39Matches: Boolean = false

  internal var text: String? = null

  internal var textDecoded: Boolean = false

  internal var typeState40: InlineBaseTextDoneEventTypeX0b2acb76? = null

  internal var typeState40Decoded: Boolean = false

  internal var typeState40Matches: Boolean = false

  internal var typeState33: InlineBaseRefusalDeltaEventTypeX772b7e35? = null

  internal var typeState33Decoded: Boolean = false

  internal var typeState33Matches: Boolean = false

  internal var typeState34: InlineBaseRefusalDeltaEventTypeX772b7e35? = null

  internal var typeState34Decoded: Boolean = false

  internal var typeState34Matches: Boolean = false

  internal var typeState35: InlineBaseRefusalDoneEventTypeXdbf2b72d? = null

  internal var typeState35Decoded: Boolean = false

  internal var typeState35Matches: Boolean = false

  internal var refusal: String? = null

  internal var refusalDecoded: Boolean = false

  internal var typeState36: InlineBaseRefusalDoneEventTypeXdbf2b72d? = null

  internal var typeState36Decoded: Boolean = false

  internal var typeState36Matches: Boolean = false

  internal var typeState5: InlineBaseAnnotationAddedEventTypeXbc690cd8? = null

  internal var typeState5Decoded: Boolean = false

  internal var typeState5Matches: Boolean = false

  internal var `annotation`: OpenAiResponsesAnnotation? = null

  internal var annotationDecoded: Boolean = false

  internal var annotationIndex: Int? = null

  internal var annotationIndexDecoded: Boolean = false

  internal var typeState6: InlineBaseAnnotationAddedEventTypeXbc690cd8? = null

  internal var typeState6Decoded: Boolean = false

  internal var typeState6Matches: Boolean = false

  internal var typeState17: InlineBaseFunctionCallArgsDeltaEventTypeXc0db7b97? = null

  internal var typeState17Decoded: Boolean = false

  internal var typeState17Matches: Boolean = false

  internal var typeState18: InlineBaseFunctionCallArgsDeltaEventTypeXc0db7b97? = null

  internal var typeState18Decoded: Boolean = false

  internal var typeState18Matches: Boolean = false

  internal var typeState19: InlineBaseFunctionCallArgsDoneEventTypeX9fa9a477? = null

  internal var typeState19Decoded: Boolean = false

  internal var typeState19Matches: Boolean = false

  internal var arguments: String? = null

  internal var argumentsDecoded: Boolean = false

  internal var name: String? = null

  internal var nameDecoded: Boolean = false

  internal var typeState20: InlineBaseFunctionCallArgsDoneEventTypeX9fa9a477? = null

  internal var typeState20Decoded: Boolean = false

  internal var typeState20Matches: Boolean = false

  internal var typeState21: InlineBaseReasoningDeltaEventTypeX3eda767b? = null

  internal var typeState21Decoded: Boolean = false

  internal var typeState21Matches: Boolean = false

  internal var typeState22: InlineBaseReasoningDeltaEventTypeX3eda767b? = null

  internal var typeState22Decoded: Boolean = false

  internal var typeState22Matches: Boolean = false

  internal var typeState23: InlineBaseReasoningDoneEventTypeX1b6171f7? = null

  internal var typeState23Decoded: Boolean = false

  internal var typeState23Matches: Boolean = false

  internal var typeState24: InlineBaseReasoningDoneEventTypeX1b6171f7? = null

  internal var typeState24Decoded: Boolean = false

  internal var typeState24Matches: Boolean = false

  internal var typeState25: InlineBaseReasoningSummaryPartAddedEventTypeX94872cab? = null

  internal var typeState25Decoded: Boolean = false

  internal var typeState25Matches: Boolean = false

  internal var partState3: ReasoningSummaryText? = null

  internal var partState3Decoded: Boolean = false

  internal var summaryIndex: Int? = null

  internal var summaryIndexDecoded: Boolean = false

  internal var typeState26: InlineBaseReasoningSummaryPartAddedEventTypeX94872cab? = null

  internal var typeState26Decoded: Boolean = false

  internal var typeState26Matches: Boolean = false

  internal var typeState27: InlineBaseReasoningSummaryPartDoneEventTypeXddb16b1a? = null

  internal var typeState27Decoded: Boolean = false

  internal var typeState27Matches: Boolean = false

  internal var typeState28: InlineBaseReasoningSummaryPartDoneEventTypeXddb16b1a? = null

  internal var typeState28Decoded: Boolean = false

  internal var typeState28Matches: Boolean = false

  internal var typeState29: InlineBaseReasoningSummaryTextDeltaEventTypeXf824160f? = null

  internal var typeState29Decoded: Boolean = false

  internal var typeState29Matches: Boolean = false

  internal var typeState30: InlineBaseReasoningSummaryTextDeltaEventTypeXf824160f? = null

  internal var typeState30Decoded: Boolean = false

  internal var typeState30Matches: Boolean = false

  internal var typeState31: InlineBaseReasoningSummaryTextDoneEventTypeXe9871e5b? = null

  internal var typeState31Decoded: Boolean = false

  internal var typeState31Matches: Boolean = false

  internal var typeState32: InlineBaseReasoningSummaryTextDoneEventTypeXe9871e5b? = null

  internal var typeState32Decoded: Boolean = false

  internal var typeState32Matches: Boolean = false

  internal var typeState75: InlineOpenAiResponsesImageGenCallInProgressTypeX00a42579? = null

  internal var typeState75Decoded: Boolean = false

  internal var typeState75Matches: Boolean = false

  internal var typeState76: InlineOpenAiResponsesImageGenCallInProgressTypeX00a42579? = null

  internal var typeState76Decoded: Boolean = false

  internal var typeState76Matches: Boolean = false

  internal var typeState73: InlineOpenAiResponsesImageGenCallGeneratingTypeX681fb2aa? = null

  internal var typeState73Decoded: Boolean = false

  internal var typeState73Matches: Boolean = false

  internal var typeState74: InlineOpenAiResponsesImageGenCallGeneratingTypeX681fb2aa? = null

  internal var typeState74Decoded: Boolean = false

  internal var typeState74Matches: Boolean = false

  internal var typeState77: InlineOpenAiResponsesImageGenCallPartialImageTypeXf8c47cdf? = null

  internal var typeState77Decoded: Boolean = false

  internal var typeState77Matches: Boolean = false

  internal var partialImageB64: String? = null

  internal var partialImageB64Decoded: Boolean = false

  internal var partialImageIndex: Int? = null

  internal var partialImageIndexDecoded: Boolean = false

  internal var typeState78: InlineOpenAiResponsesImageGenCallPartialImageTypeXf8c47cdf? = null

  internal var typeState78Decoded: Boolean = false

  internal var typeState78Matches: Boolean = false

  internal var typeState71: InlineOpenAiResponsesImageGenCallCompletedTypeX22f05767? = null

  internal var typeState71Decoded: Boolean = false

  internal var typeState71Matches: Boolean = false

  internal var typeState72: InlineOpenAiResponsesImageGenCallCompletedTypeX22f05767? = null

  internal var typeState72Decoded: Boolean = false

  internal var typeState72Matches: Boolean = false

  internal var typeState81: InlineOpenAiResponsesWebSearchCallInProgressTypeX435e8287? = null

  internal var typeState81Decoded: Boolean = false

  internal var typeState81Matches: Boolean = false

  internal var typeState82: InlineOpenAiResponsesWebSearchCallInProgressTypeX435e8287? = null

  internal var typeState82Decoded: Boolean = false

  internal var typeState82Matches: Boolean = false

  internal var typeState83: InlineOpenAiResponsesWebSearchCallSearchingTypeXffe34362? = null

  internal var typeState83Decoded: Boolean = false

  internal var typeState83Matches: Boolean = false

  internal var typeState84: InlineOpenAiResponsesWebSearchCallSearchingTypeXffe34362? = null

  internal var typeState84Decoded: Boolean = false

  internal var typeState84Matches: Boolean = false

  internal var typeState79: InlineOpenAiResponsesSearchCompletedTypeXbbabb05c? = null

  internal var typeState79Decoded: Boolean = false

  internal var typeState79Matches: Boolean = false

  internal var typeState80: InlineOpenAiResponsesSearchCompletedTypeXbbabb05c? = null

  internal var typeState80Decoded: Boolean = false

  internal var typeState80Matches: Boolean = false

  internal var typeState11: InlineBaseCustomToolCallInputDeltaEventTypeXce45a844? = null

  internal var typeState11Decoded: Boolean = false

  internal var typeState11Matches: Boolean = false

  internal var typeState12: InlineBaseCustomToolCallInputDeltaEventTypeXce45a844? = null

  internal var typeState12Decoded: Boolean = false

  internal var typeState12Matches: Boolean = false

  internal var typeState13: InlineBaseCustomToolCallInputDoneEventTypeX61c85e37? = null

  internal var typeState13Decoded: Boolean = false

  internal var typeState13Matches: Boolean = false

  internal var input: String? = null

  internal var inputDecoded: Boolean = false

  internal var typeState14: InlineBaseCustomToolCallInputDoneEventTypeX61c85e37? = null

  internal var typeState14Decoded: Boolean = false

  internal var typeState14Matches: Boolean = false

  internal var typeState1: InlineApplyPatchCallOperationDiffDeltaEventTypeX2a517bb3? = null

  internal var typeState1Decoded: Boolean = false

  internal var typeState1Matches: Boolean = false

  internal var typeState2: InlineApplyPatchCallOperationDiffDeltaEventTypeX2a517bb3? = null

  internal var typeState2Decoded: Boolean = false

  internal var typeState2Matches: Boolean = false

  internal var typeState3: InlineApplyPatchCallOperationDiffDoneEventTypeX82fcb82d? = null

  internal var typeState3Decoded: Boolean = false

  internal var typeState3Matches: Boolean = false

  internal var diff: String? = null

  internal var diffDecoded: Boolean = false

  internal var typeState4: InlineApplyPatchCallOperationDiffDoneEventTypeX82fcb82d? = null

  internal var typeState4Decoded: Boolean = false

  internal var typeState4Matches: Boolean = false

  internal var typeState55: InlineFusionCallInProgressEventTypeXd4ded992? = null

  internal var typeState55Decoded: Boolean = false

  internal var typeState55Matches: Boolean = false

  internal var typeState56: InlineFusionCallInProgressEventTypeXd4ded992? = null

  internal var typeState56Decoded: Boolean = false

  internal var typeState56Matches: Boolean = false

  internal var typeState57: InlineFusionCallPanelAddedEventTypeXa7e7b6c6? = null

  internal var typeState57Decoded: Boolean = false

  internal var typeState57Matches: Boolean = false

  internal var model: String? = null

  internal var modelDecoded: Boolean = false

  internal var typeState58: InlineFusionCallPanelAddedEventTypeXa7e7b6c6? = null

  internal var typeState58Decoded: Boolean = false

  internal var typeState58Matches: Boolean = false

  internal var typeState61: InlineFusionCallPanelDeltaEventTypeX8bdec444? = null

  internal var typeState61Decoded: Boolean = false

  internal var typeState61Matches: Boolean = false

  internal var typeState62: InlineFusionCallPanelDeltaEventTypeX8bdec444? = null

  internal var typeState62Decoded: Boolean = false

  internal var typeState62Matches: Boolean = false

  internal var typeState65: InlineFusionCallPanelReasoningDeltaEventTypeX6c55d981? = null

  internal var typeState65Decoded: Boolean = false

  internal var typeState65Matches: Boolean = false

  internal var typeState66: InlineFusionCallPanelReasoningDeltaEventTypeX6c55d981? = null

  internal var typeState66Decoded: Boolean = false

  internal var typeState66Matches: Boolean = false

  internal var typeState59: InlineFusionCallPanelCompletedEventTypeXccd0e5e6? = null

  internal var typeState59Decoded: Boolean = false

  internal var typeState59Matches: Boolean = false

  internal var content: String? = null

  internal var contentDecoded: Boolean = false

  internal var typeState60: InlineFusionCallPanelCompletedEventTypeXccd0e5e6? = null

  internal var typeState60Decoded: Boolean = false

  internal var typeState60Matches: Boolean = false

  internal var typeState63: InlineFusionCallPanelFailedEventTypeXf84539ef? = null

  internal var typeState63Decoded: Boolean = false

  internal var typeState63Matches: Boolean = false

  internal var error: String? = null

  internal var errorDecoded: Boolean = false

  internal var typeState64: InlineFusionCallPanelFailedEventTypeXf84539ef? = null

  internal var typeState64Decoded: Boolean = false

  internal var typeState64Matches: Boolean = false

  internal var typeState51: InlineFusionCallAnalysisInProgressEventTypeX56870346? = null

  internal var typeState51Decoded: Boolean = false

  internal var typeState51Matches: Boolean = false

  internal var judgeModel: String? = null

  internal var judgeModelDecoded: Boolean = false

  internal var typeState52: InlineFusionCallAnalysisInProgressEventTypeX56870346? = null

  internal var typeState52Decoded: Boolean = false

  internal var typeState52Matches: Boolean = false

  internal var typeState49: InlineFusionCallAnalysisCompletedEventTypeX2230fa92? = null

  internal var typeState49Decoded: Boolean = false

  internal var typeState49Matches: Boolean = false

  internal var analysis: FusionAnalysisResult? = null

  internal var analysisDecoded: Boolean = false

  internal var typeState50: InlineFusionCallAnalysisCompletedEventTypeX2230fa92? = null

  internal var typeState50Decoded: Boolean = false

  internal var typeState50Matches: Boolean = false

  internal var typeState53: InlineFusionCallCompletedEventTypeX098a1518? = null

  internal var typeState53Decoded: Boolean = false

  internal var typeState53Matches: Boolean = false

  internal var typeState54: InlineFusionCallCompletedEventTypeX098a1518? = null

  internal var typeState54Decoded: Boolean = false

  internal var typeState54Matches: Boolean = false

  internal var typeState45: InlineDebugEventTypeX9f7f544d? = null

  internal var typeState45Decoded: Boolean = false

  internal var typeState45Matches: Boolean = false

  internal var debug: InlineDebugEventDebugX52571c89? = null

  internal var debugDecoded: Boolean = false

  internal var typeState46: InlineDebugEventTypeX9f7f544d? = null

  internal var typeState46Decoded: Boolean = false

  internal var typeState46Matches: Boolean = false

  internal var openResponsesCreatedEventMatches: Boolean = false

  internal var openResponsesInProgressEventMatches: Boolean = false

  internal var streamEventsResponseCompletedMatches: Boolean = false

  internal var streamEventsResponseIncompleteMatches: Boolean = false

  internal var streamEventsResponseFailedMatches: Boolean = false

  internal var errorEventMatches: Boolean = false

  internal var streamEventsResponseOutputItemAddedMatches: Boolean = false

  internal var streamEventsResponseOutputItemDoneMatches: Boolean = false

  internal var contentPartAddedEventMatches: Boolean = false

  internal var contentPartDoneEventMatches: Boolean = false

  internal var textDeltaEventMatches: Boolean = false

  internal var textDoneEventMatches: Boolean = false

  internal var refusalDeltaEventMatches: Boolean = false

  internal var refusalDoneEventMatches: Boolean = false

  internal var annotationAddedEventMatches: Boolean = false

  internal var functionCallArgsDeltaEventMatches: Boolean = false

  internal var functionCallArgsDoneEventMatches: Boolean = false

  internal var reasoningDeltaEventMatches: Boolean = false

  internal var reasoningDoneEventMatches: Boolean = false

  internal var reasoningSummaryPartAddedEventMatches: Boolean = false

  internal var reasoningSummaryPartDoneEventMatches: Boolean = false

  internal var reasoningSummaryTextDeltaEventMatches: Boolean = false

  internal var reasoningSummaryTextDoneEventMatches: Boolean = false

  internal var imageGenCallInProgressEventMatches: Boolean = false

  internal var imageGenCallGeneratingEventMatches: Boolean = false

  internal var imageGenCallPartialImageEventMatches: Boolean = false

  internal var imageGenCallCompletedEventMatches: Boolean = false

  internal var webSearchCallInProgressEventMatches: Boolean = false

  internal var webSearchCallSearchingEventMatches: Boolean = false

  internal var webSearchCallCompletedEventMatches: Boolean = false

  internal var customToolCallInputDeltaEventMatches: Boolean = false

  internal var customToolCallInputDoneEventMatches: Boolean = false

  internal var applyPatchCallOperationDiffDeltaEventMatches: Boolean = false

  internal var applyPatchCallOperationDiffDoneEventMatches: Boolean = false

  internal var fusionCallInProgressEventMatches: Boolean = false

  internal var fusionCallPanelAddedEventMatches: Boolean = false

  internal var fusionCallPanelDeltaEventMatches: Boolean = false

  internal var fusionCallPanelReasoningDeltaEventMatches: Boolean = false

  internal var fusionCallPanelCompletedEventMatches: Boolean = false

  internal var fusionCallPanelFailedEventMatches: Boolean = false

  internal var fusionCallAnalysisInProgressEventMatches: Boolean = false

  internal var fusionCallAnalysisCompletedEventMatches: Boolean = false

  internal var fusionCallCompletedEventMatches: Boolean = false

  internal var debugEventMatches: Boolean = false

  internal var rawEmpty: Boolean = false

  internal var failures: List<String> = emptyList()

  public val names: List<String>
    get() = buildList {
      if (openResponsesCreatedEventMatches) add("OpenResponsesCreatedEvent")
      if (openResponsesInProgressEventMatches) add("OpenResponsesInProgressEvent")
      if (streamEventsResponseCompletedMatches) add("StreamEventsResponseCompleted")
      if (streamEventsResponseIncompleteMatches) add("StreamEventsResponseIncomplete")
      if (streamEventsResponseFailedMatches) add("StreamEventsResponseFailed")
      if (errorEventMatches) add("ErrorEvent")
      if (streamEventsResponseOutputItemAddedMatches) add("StreamEventsResponseOutputItemAdded")
      if (streamEventsResponseOutputItemDoneMatches) add("StreamEventsResponseOutputItemDone")
      if (contentPartAddedEventMatches) add("ContentPartAddedEvent")
      if (contentPartDoneEventMatches) add("ContentPartDoneEvent")
      if (textDeltaEventMatches) add("TextDeltaEvent")
      if (textDoneEventMatches) add("TextDoneEvent")
      if (refusalDeltaEventMatches) add("RefusalDeltaEvent")
      if (refusalDoneEventMatches) add("RefusalDoneEvent")
      if (annotationAddedEventMatches) add("AnnotationAddedEvent")
      if (functionCallArgsDeltaEventMatches) add("FunctionCallArgsDeltaEvent")
      if (functionCallArgsDoneEventMatches) add("FunctionCallArgsDoneEvent")
      if (reasoningDeltaEventMatches) add("ReasoningDeltaEvent")
      if (reasoningDoneEventMatches) add("ReasoningDoneEvent")
      if (reasoningSummaryPartAddedEventMatches) add("ReasoningSummaryPartAddedEvent")
      if (reasoningSummaryPartDoneEventMatches) add("ReasoningSummaryPartDoneEvent")
      if (reasoningSummaryTextDeltaEventMatches) add("ReasoningSummaryTextDeltaEvent")
      if (reasoningSummaryTextDoneEventMatches) add("ReasoningSummaryTextDoneEvent")
      if (imageGenCallInProgressEventMatches) add("ImageGenCallInProgressEvent")
      if (imageGenCallGeneratingEventMatches) add("ImageGenCallGeneratingEvent")
      if (imageGenCallPartialImageEventMatches) add("ImageGenCallPartialImageEvent")
      if (imageGenCallCompletedEventMatches) add("ImageGenCallCompletedEvent")
      if (webSearchCallInProgressEventMatches) add("WebSearchCallInProgressEvent")
      if (webSearchCallSearchingEventMatches) add("WebSearchCallSearchingEvent")
      if (webSearchCallCompletedEventMatches) add("WebSearchCallCompletedEvent")
      if (customToolCallInputDeltaEventMatches) add("CustomToolCallInputDeltaEvent")
      if (customToolCallInputDoneEventMatches) add("CustomToolCallInputDoneEvent")
      if (applyPatchCallOperationDiffDeltaEventMatches) add("ApplyPatchCallOperationDiffDeltaEvent")
      if (applyPatchCallOperationDiffDoneEventMatches) add("ApplyPatchCallOperationDiffDoneEvent")
      if (fusionCallInProgressEventMatches) add("FusionCallInProgressEvent")
      if (fusionCallPanelAddedEventMatches) add("FusionCallPanelAddedEvent")
      if (fusionCallPanelDeltaEventMatches) add("FusionCallPanelDeltaEvent")
      if (fusionCallPanelReasoningDeltaEventMatches) add("FusionCallPanelReasoningDeltaEvent")
      if (fusionCallPanelCompletedEventMatches) add("FusionCallPanelCompletedEvent")
      if (fusionCallPanelFailedEventMatches) add("FusionCallPanelFailedEvent")
      if (fusionCallAnalysisInProgressEventMatches) add("FusionCallAnalysisInProgressEvent")
      if (fusionCallAnalysisCompletedEventMatches) add("FusionCallAnalysisCompletedEvent")
      if (fusionCallCompletedEventMatches) add("FusionCallCompletedEvent")
      if (debugEventMatches) add("DebugEvent")
    }

  public val size: Int
    get() = names.size
}

private fun inspectStreamEvents(rawObject: JsonObject): StreamEventsInspection {
  val typeState43Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineCreatedEventTypeX5df1e0b6>(element) } }
  val typeState43 = typeState43Result?.getOrNull()
  val typeState43Decoded = typeState43Result?.isSuccess == true
  val typeState43Matches = (rawObject.stringValue("type") == "response.created") && typeState43Decoded
  val responseResult = rawObject["response"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<OpenResponsesResult>(element) } }
  val response = responseResult?.getOrNull()
  val responseDecoded = responseResult?.isSuccess == true
  val sequenceNumberResult = rawObject["sequence_number"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val sequenceNumber = sequenceNumberResult?.getOrNull()
  val sequenceNumberDecoded = sequenceNumberResult?.isSuccess == true
  val typeState44Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineCreatedEventTypeX5df1e0b6>(element) } }
  val typeState44 = typeState44Result?.getOrNull()
  val typeState44Decoded = typeState44Result?.isSuccess == true
  val typeState44Matches = (rawObject.stringValue("type") == "response.created") && typeState44Decoded
  val typeState67Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineInProgressEventTypeX9cb33eb5>(element) } }
  val typeState67 = typeState67Result?.getOrNull()
  val typeState67Decoded = typeState67Result?.isSuccess == true
  val typeState67Matches = (rawObject.stringValue("type") == "response.in_progress") && typeState67Decoded
  val typeState68Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineInProgressEventTypeX9cb33eb5>(element) } }
  val typeState68 = typeState68Result?.getOrNull()
  val typeState68Decoded = typeState68Result?.isSuccess == true
  val typeState68Matches = (rawObject.stringValue("type") == "response.in_progress") && typeState68Decoded
  val typeState41Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineCompletedEventTypeXb615442a>(element) } }
  val typeState41 = typeState41Result?.getOrNull()
  val typeState41Decoded = typeState41Result?.isSuccess == true
  val typeState41Matches = (rawObject.stringValue("type") == "response.completed") && typeState41Decoded
  val typeState42Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineCompletedEventTypeXb615442a>(element) } }
  val typeState42 = typeState42Result?.getOrNull()
  val typeState42Decoded = typeState42Result?.isSuccess == true
  val typeState42Matches = (rawObject.stringValue("type") == "response.completed") && typeState42Decoded
  val typeState69Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineIncompleteEventTypeX2a7bc849>(element) } }
  val typeState69 = typeState69Result?.getOrNull()
  val typeState69Decoded = typeState69Result?.isSuccess == true
  val typeState69Matches = (rawObject.stringValue("type") == "response.incomplete") && typeState69Decoded
  val typeState70Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineIncompleteEventTypeX2a7bc849>(element) } }
  val typeState70 = typeState70Result?.getOrNull()
  val typeState70Decoded = typeState70Result?.isSuccess == true
  val typeState70Matches = (rawObject.stringValue("type") == "response.incomplete") && typeState70Decoded
  val typeState47Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFailedEventTypeX5da253bb>(element) } }
  val typeState47 = typeState47Result?.getOrNull()
  val typeState47Decoded = typeState47Result?.isSuccess == true
  val typeState47Matches = (rawObject.stringValue("type") == "response.failed") && typeState47Decoded
  val typeState48Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFailedEventTypeX5da253bb>(element) } }
  val typeState48 = typeState48Result?.getOrNull()
  val typeState48Decoded = typeState48Result?.isSuccess == true
  val typeState48Matches = (rawObject.stringValue("type") == "response.failed") && typeState48Decoded
  val typeState15Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseErrorEventTypeXb81f86a5>(element) } }
  val typeState15 = typeState15Result?.getOrNull()
  val typeState15Decoded = typeState15Result?.isSuccess == true
  val typeState15Matches = (rawObject.stringValue("type") == "error") && typeState15Decoded
  val codeResult = rawObject["code"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val code = codeResult?.getOrNull()
  val codePresent = rawObject.containsKey("code")
  val codeDecoded = codeResult?.isSuccess == true
  val messageResult = rawObject["message"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val message = messageResult?.getOrNull()
  val messageDecoded = messageResult?.isSuccess == true
  val paramResult = rawObject["param"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val param = paramResult?.getOrNull()
  val paramPresent = rawObject.containsKey("param")
  val paramDecoded = paramResult?.isSuccess == true
  val typeState16Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseErrorEventTypeXb81f86a5>(element) } }
  val typeState16 = typeState16Result?.getOrNull()
  val typeState16Decoded = typeState16Result?.isSuccess == true
  val typeState16Matches = (rawObject.stringValue("type") == "error") && typeState16Decoded
  val typeState85Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemAddedEventTypeX285183a5>(element) } }
  val typeState85 = typeState85Result?.getOrNull()
  val typeState85Decoded = typeState85Result?.isSuccess == true
  val typeState85Matches = (rawObject.stringValue("type") == "response.output_item.added") && typeState85Decoded
  val itemResult = rawObject["item"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<OutputItems>(element) } }
  val item = itemResult?.getOrNull()
  val itemDecoded = itemResult?.isSuccess == true
  val outputIndexResult = rawObject["output_index"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val outputIndex = outputIndexResult?.getOrNull()
  val outputIndexDecoded = outputIndexResult?.isSuccess == true
  val typeState86Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemAddedEventTypeX285183a5>(element) } }
  val typeState86 = typeState86Result?.getOrNull()
  val typeState86Decoded = typeState86Result?.isSuccess == true
  val typeState86Matches = (rawObject.stringValue("type") == "response.output_item.added") && typeState86Decoded
  val typeState87Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemDoneEventTypeX3fc126fd>(element) } }
  val typeState87 = typeState87Result?.getOrNull()
  val typeState87Decoded = typeState87Result?.isSuccess == true
  val typeState87Matches = (rawObject.stringValue("type") == "response.output_item.done") && typeState87Decoded
  val typeState88Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemDoneEventTypeX3fc126fd>(element) } }
  val typeState88 = typeState88Result?.getOrNull()
  val typeState88Decoded = typeState88Result?.isSuccess == true
  val typeState88Matches = (rawObject.stringValue("type") == "response.output_item.done") && typeState88Decoded
  val typeState7Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseContentPartAddedEventTypeXef1bd9f5>(element) } }
  val typeState7 = typeState7Result?.getOrNull()
  val typeState7Decoded = typeState7Result?.isSuccess == true
  val typeState7Matches = (rawObject.stringValue("type") == "response.content_part.added") && typeState7Decoded
  val contentIndexResult = rawObject["content_index"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val contentIndex = contentIndexResult?.getOrNull()
  val contentIndexDecoded = contentIndexResult?.isSuccess == true
  val itemIdResult = rawObject["item_id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val itemId = itemIdResult?.getOrNull()
  val itemIdDecoded = itemIdResult?.isSuccess == true
  val partState1Result = rawObject["part"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseContentPartAddedEventPartXe4ac1bd0>(element) } }
  val partState1 = partState1Result?.getOrNull()
  val partState1Decoded = partState1Result?.isSuccess == true
  val typeState8Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseContentPartAddedEventTypeXef1bd9f5>(element) } }
  val typeState8 = typeState8Result?.getOrNull()
  val typeState8Decoded = typeState8Result?.isSuccess == true
  val typeState8Matches = (rawObject.stringValue("type") == "response.content_part.added") && typeState8Decoded
  val typeState9Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseContentPartDoneEventTypeX449d5d90>(element) } }
  val typeState9 = typeState9Result?.getOrNull()
  val typeState9Decoded = typeState9Result?.isSuccess == true
  val typeState9Matches = (rawObject.stringValue("type") == "response.content_part.done") && typeState9Decoded
  val partState2Result = rawObject["part"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseContentPartDoneEventPartX9028e32f>(element) } }
  val partState2 = partState2Result?.getOrNull()
  val partState2Decoded = partState2Result?.isSuccess == true
  val typeState10Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseContentPartDoneEventTypeX449d5d90>(element) } }
  val typeState10 = typeState10Result?.getOrNull()
  val typeState10Decoded = typeState10Result?.isSuccess == true
  val typeState10Matches = (rawObject.stringValue("type") == "response.content_part.done") && typeState10Decoded
  val typeState37Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseTextDeltaEventTypeX34a64077>(element) } }
  val typeState37 = typeState37Result?.getOrNull()
  val typeState37Decoded = typeState37Result?.isSuccess == true
  val typeState37Matches = (rawObject.stringValue("type") == "response.output_text.delta") && typeState37Decoded
  val deltaResult = rawObject["delta"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val delta = deltaResult?.getOrNull()
  val deltaDecoded = deltaResult?.isSuccess == true
  val logprobsResult = rawObject["logprobs"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<StreamLogprob>>(element) } }
  val logprobs = logprobsResult?.getOrNull()
  val logprobsDecoded = logprobsResult?.isSuccess == true
  val typeState38Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseTextDeltaEventTypeX34a64077>(element) } }
  val typeState38 = typeState38Result?.getOrNull()
  val typeState38Decoded = typeState38Result?.isSuccess == true
  val typeState38Matches = (rawObject.stringValue("type") == "response.output_text.delta") && typeState38Decoded
  val typeState39Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseTextDoneEventTypeX0b2acb76>(element) } }
  val typeState39 = typeState39Result?.getOrNull()
  val typeState39Decoded = typeState39Result?.isSuccess == true
  val typeState39Matches = (rawObject.stringValue("type") == "response.output_text.done") && typeState39Decoded
  val textResult = rawObject["text"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val text = textResult?.getOrNull()
  val textDecoded = textResult?.isSuccess == true
  val typeState40Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseTextDoneEventTypeX0b2acb76>(element) } }
  val typeState40 = typeState40Result?.getOrNull()
  val typeState40Decoded = typeState40Result?.isSuccess == true
  val typeState40Matches = (rawObject.stringValue("type") == "response.output_text.done") && typeState40Decoded
  val typeState33Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseRefusalDeltaEventTypeX772b7e35>(element) } }
  val typeState33 = typeState33Result?.getOrNull()
  val typeState33Decoded = typeState33Result?.isSuccess == true
  val typeState33Matches = (rawObject.stringValue("type") == "response.refusal.delta") && typeState33Decoded
  val typeState34Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseRefusalDeltaEventTypeX772b7e35>(element) } }
  val typeState34 = typeState34Result?.getOrNull()
  val typeState34Decoded = typeState34Result?.isSuccess == true
  val typeState34Matches = (rawObject.stringValue("type") == "response.refusal.delta") && typeState34Decoded
  val typeState35Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseRefusalDoneEventTypeXdbf2b72d>(element) } }
  val typeState35 = typeState35Result?.getOrNull()
  val typeState35Decoded = typeState35Result?.isSuccess == true
  val typeState35Matches = (rawObject.stringValue("type") == "response.refusal.done") && typeState35Decoded
  val refusalResult = rawObject["refusal"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val refusal = refusalResult?.getOrNull()
  val refusalDecoded = refusalResult?.isSuccess == true
  val typeState36Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseRefusalDoneEventTypeXdbf2b72d>(element) } }
  val typeState36 = typeState36Result?.getOrNull()
  val typeState36Decoded = typeState36Result?.isSuccess == true
  val typeState36Matches = (rawObject.stringValue("type") == "response.refusal.done") && typeState36Decoded
  val typeState5Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseAnnotationAddedEventTypeXbc690cd8>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  val typeState5Matches = (rawObject.stringValue("type") == "response.output_text.annotation.added") && typeState5Decoded
  val annotationResult = rawObject["annotation"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<OpenAiResponsesAnnotation>(element) } }
  val annotation = annotationResult?.getOrNull()
  val annotationDecoded = annotationResult?.isSuccess == true
  val annotationIndexResult = rawObject["annotation_index"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val annotationIndex = annotationIndexResult?.getOrNull()
  val annotationIndexDecoded = annotationIndexResult?.isSuccess == true
  val typeState6Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseAnnotationAddedEventTypeXbc690cd8>(element) } }
  val typeState6 = typeState6Result?.getOrNull()
  val typeState6Decoded = typeState6Result?.isSuccess == true
  val typeState6Matches = (rawObject.stringValue("type") == "response.output_text.annotation.added") && typeState6Decoded
  val typeState17Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseFunctionCallArgsDeltaEventTypeXc0db7b97>(element) } }
  val typeState17 = typeState17Result?.getOrNull()
  val typeState17Decoded = typeState17Result?.isSuccess == true
  val typeState17Matches = (rawObject.stringValue("type") == "response.function_call_arguments.delta") && typeState17Decoded
  val typeState18Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseFunctionCallArgsDeltaEventTypeXc0db7b97>(element) } }
  val typeState18 = typeState18Result?.getOrNull()
  val typeState18Decoded = typeState18Result?.isSuccess == true
  val typeState18Matches = (rawObject.stringValue("type") == "response.function_call_arguments.delta") && typeState18Decoded
  val typeState19Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseFunctionCallArgsDoneEventTypeX9fa9a477>(element) } }
  val typeState19 = typeState19Result?.getOrNull()
  val typeState19Decoded = typeState19Result?.isSuccess == true
  val typeState19Matches = (rawObject.stringValue("type") == "response.function_call_arguments.done") && typeState19Decoded
  val argumentsResult = rawObject["arguments"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val arguments = argumentsResult?.getOrNull()
  val argumentsDecoded = argumentsResult?.isSuccess == true
  val nameResult = rawObject["name"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val name = nameResult?.getOrNull()
  val nameDecoded = nameResult?.isSuccess == true
  val typeState20Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseFunctionCallArgsDoneEventTypeX9fa9a477>(element) } }
  val typeState20 = typeState20Result?.getOrNull()
  val typeState20Decoded = typeState20Result?.isSuccess == true
  val typeState20Matches = (rawObject.stringValue("type") == "response.function_call_arguments.done") && typeState20Decoded
  val typeState21Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseReasoningDeltaEventTypeX3eda767b>(element) } }
  val typeState21 = typeState21Result?.getOrNull()
  val typeState21Decoded = typeState21Result?.isSuccess == true
  val typeState21Matches = (rawObject.stringValue("type") == "response.reasoning_text.delta") && typeState21Decoded
  val typeState22Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseReasoningDeltaEventTypeX3eda767b>(element) } }
  val typeState22 = typeState22Result?.getOrNull()
  val typeState22Decoded = typeState22Result?.isSuccess == true
  val typeState22Matches = (rawObject.stringValue("type") == "response.reasoning_text.delta") && typeState22Decoded
  val typeState23Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseReasoningDoneEventTypeX1b6171f7>(element) } }
  val typeState23 = typeState23Result?.getOrNull()
  val typeState23Decoded = typeState23Result?.isSuccess == true
  val typeState23Matches = (rawObject.stringValue("type") == "response.reasoning_text.done") && typeState23Decoded
  val typeState24Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseReasoningDoneEventTypeX1b6171f7>(element) } }
  val typeState24 = typeState24Result?.getOrNull()
  val typeState24Decoded = typeState24Result?.isSuccess == true
  val typeState24Matches = (rawObject.stringValue("type") == "response.reasoning_text.done") && typeState24Decoded
  val typeState25Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseReasoningSummaryPartAddedEventTypeX94872cab>(element) } }
  val typeState25 = typeState25Result?.getOrNull()
  val typeState25Decoded = typeState25Result?.isSuccess == true
  val typeState25Matches = (rawObject.stringValue("type") == "response.reasoning_summary_part.added") && typeState25Decoded
  val partState3Result = rawObject["part"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<ReasoningSummaryText>(element) } }
  val partState3 = partState3Result?.getOrNull()
  val partState3Decoded = partState3Result?.isSuccess == true
  val summaryIndexResult = rawObject["summary_index"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val summaryIndex = summaryIndexResult?.getOrNull()
  val summaryIndexDecoded = summaryIndexResult?.isSuccess == true
  val typeState26Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseReasoningSummaryPartAddedEventTypeX94872cab>(element) } }
  val typeState26 = typeState26Result?.getOrNull()
  val typeState26Decoded = typeState26Result?.isSuccess == true
  val typeState26Matches = (rawObject.stringValue("type") == "response.reasoning_summary_part.added") && typeState26Decoded
  val typeState27Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseReasoningSummaryPartDoneEventTypeXddb16b1a>(element) } }
  val typeState27 = typeState27Result?.getOrNull()
  val typeState27Decoded = typeState27Result?.isSuccess == true
  val typeState27Matches = (rawObject.stringValue("type") == "response.reasoning_summary_part.done") && typeState27Decoded
  val typeState28Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseReasoningSummaryPartDoneEventTypeXddb16b1a>(element) } }
  val typeState28 = typeState28Result?.getOrNull()
  val typeState28Decoded = typeState28Result?.isSuccess == true
  val typeState28Matches = (rawObject.stringValue("type") == "response.reasoning_summary_part.done") && typeState28Decoded
  val typeState29Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseReasoningSummaryTextDeltaEventTypeXf824160f>(element) } }
  val typeState29 = typeState29Result?.getOrNull()
  val typeState29Decoded = typeState29Result?.isSuccess == true
  val typeState29Matches = (rawObject.stringValue("type") == "response.reasoning_summary_text.delta") && typeState29Decoded
  val typeState30Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseReasoningSummaryTextDeltaEventTypeXf824160f>(element) } }
  val typeState30 = typeState30Result?.getOrNull()
  val typeState30Decoded = typeState30Result?.isSuccess == true
  val typeState30Matches = (rawObject.stringValue("type") == "response.reasoning_summary_text.delta") && typeState30Decoded
  val typeState31Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseReasoningSummaryTextDoneEventTypeXe9871e5b>(element) } }
  val typeState31 = typeState31Result?.getOrNull()
  val typeState31Decoded = typeState31Result?.isSuccess == true
  val typeState31Matches = (rawObject.stringValue("type") == "response.reasoning_summary_text.done") && typeState31Decoded
  val typeState32Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseReasoningSummaryTextDoneEventTypeXe9871e5b>(element) } }
  val typeState32 = typeState32Result?.getOrNull()
  val typeState32Decoded = typeState32Result?.isSuccess == true
  val typeState32Matches = (rawObject.stringValue("type") == "response.reasoning_summary_text.done") && typeState32Decoded
  val typeState75Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOpenAiResponsesImageGenCallInProgressTypeX00a42579>(element) } }
  val typeState75 = typeState75Result?.getOrNull()
  val typeState75Decoded = typeState75Result?.isSuccess == true
  val typeState75Matches = (rawObject.stringValue("type") == "response.image_generation_call.in_progress") && typeState75Decoded
  val typeState76Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOpenAiResponsesImageGenCallInProgressTypeX00a42579>(element) } }
  val typeState76 = typeState76Result?.getOrNull()
  val typeState76Decoded = typeState76Result?.isSuccess == true
  val typeState76Matches = (rawObject.stringValue("type") == "response.image_generation_call.in_progress") && typeState76Decoded
  val typeState73Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOpenAiResponsesImageGenCallGeneratingTypeX681fb2aa>(element) } }
  val typeState73 = typeState73Result?.getOrNull()
  val typeState73Decoded = typeState73Result?.isSuccess == true
  val typeState73Matches = (rawObject.stringValue("type") == "response.image_generation_call.generating") && typeState73Decoded
  val typeState74Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOpenAiResponsesImageGenCallGeneratingTypeX681fb2aa>(element) } }
  val typeState74 = typeState74Result?.getOrNull()
  val typeState74Decoded = typeState74Result?.isSuccess == true
  val typeState74Matches = (rawObject.stringValue("type") == "response.image_generation_call.generating") && typeState74Decoded
  val typeState77Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOpenAiResponsesImageGenCallPartialImageTypeXf8c47cdf>(element) } }
  val typeState77 = typeState77Result?.getOrNull()
  val typeState77Decoded = typeState77Result?.isSuccess == true
  val typeState77Matches = (rawObject.stringValue("type") == "response.image_generation_call.partial_image") && typeState77Decoded
  val partialImageB64Result = rawObject["partial_image_b64"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val partialImageB64 = partialImageB64Result?.getOrNull()
  val partialImageB64Decoded = partialImageB64Result?.isSuccess == true
  val partialImageIndexResult = rawObject["partial_image_index"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val partialImageIndex = partialImageIndexResult?.getOrNull()
  val partialImageIndexDecoded = partialImageIndexResult?.isSuccess == true
  val typeState78Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOpenAiResponsesImageGenCallPartialImageTypeXf8c47cdf>(element) } }
  val typeState78 = typeState78Result?.getOrNull()
  val typeState78Decoded = typeState78Result?.isSuccess == true
  val typeState78Matches = (rawObject.stringValue("type") == "response.image_generation_call.partial_image") && typeState78Decoded
  val typeState71Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOpenAiResponsesImageGenCallCompletedTypeX22f05767>(element) } }
  val typeState71 = typeState71Result?.getOrNull()
  val typeState71Decoded = typeState71Result?.isSuccess == true
  val typeState71Matches = (rawObject.stringValue("type") == "response.image_generation_call.completed") && typeState71Decoded
  val typeState72Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOpenAiResponsesImageGenCallCompletedTypeX22f05767>(element) } }
  val typeState72 = typeState72Result?.getOrNull()
  val typeState72Decoded = typeState72Result?.isSuccess == true
  val typeState72Matches = (rawObject.stringValue("type") == "response.image_generation_call.completed") && typeState72Decoded
  val typeState81Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOpenAiResponsesWebSearchCallInProgressTypeX435e8287>(element) } }
  val typeState81 = typeState81Result?.getOrNull()
  val typeState81Decoded = typeState81Result?.isSuccess == true
  val typeState81Matches = (rawObject.stringValue("type") == "response.web_search_call.in_progress") && typeState81Decoded
  val typeState82Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOpenAiResponsesWebSearchCallInProgressTypeX435e8287>(element) } }
  val typeState82 = typeState82Result?.getOrNull()
  val typeState82Decoded = typeState82Result?.isSuccess == true
  val typeState82Matches = (rawObject.stringValue("type") == "response.web_search_call.in_progress") && typeState82Decoded
  val typeState83Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOpenAiResponsesWebSearchCallSearchingTypeXffe34362>(element) } }
  val typeState83 = typeState83Result?.getOrNull()
  val typeState83Decoded = typeState83Result?.isSuccess == true
  val typeState83Matches = (rawObject.stringValue("type") == "response.web_search_call.searching") && typeState83Decoded
  val typeState84Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOpenAiResponsesWebSearchCallSearchingTypeXffe34362>(element) } }
  val typeState84 = typeState84Result?.getOrNull()
  val typeState84Decoded = typeState84Result?.isSuccess == true
  val typeState84Matches = (rawObject.stringValue("type") == "response.web_search_call.searching") && typeState84Decoded
  val typeState79Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOpenAiResponsesSearchCompletedTypeXbbabb05c>(element) } }
  val typeState79 = typeState79Result?.getOrNull()
  val typeState79Decoded = typeState79Result?.isSuccess == true
  val typeState79Matches = (rawObject.stringValue("type") == "response.web_search_call.completed") && typeState79Decoded
  val typeState80Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOpenAiResponsesSearchCompletedTypeXbbabb05c>(element) } }
  val typeState80 = typeState80Result?.getOrNull()
  val typeState80Decoded = typeState80Result?.isSuccess == true
  val typeState80Matches = (rawObject.stringValue("type") == "response.web_search_call.completed") && typeState80Decoded
  val typeState11Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseCustomToolCallInputDeltaEventTypeXce45a844>(element) } }
  val typeState11 = typeState11Result?.getOrNull()
  val typeState11Decoded = typeState11Result?.isSuccess == true
  val typeState11Matches = (rawObject.stringValue("type") == "response.custom_tool_call_input.delta") && typeState11Decoded
  val typeState12Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseCustomToolCallInputDeltaEventTypeXce45a844>(element) } }
  val typeState12 = typeState12Result?.getOrNull()
  val typeState12Decoded = typeState12Result?.isSuccess == true
  val typeState12Matches = (rawObject.stringValue("type") == "response.custom_tool_call_input.delta") && typeState12Decoded
  val typeState13Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseCustomToolCallInputDoneEventTypeX61c85e37>(element) } }
  val typeState13 = typeState13Result?.getOrNull()
  val typeState13Decoded = typeState13Result?.isSuccess == true
  val typeState13Matches = (rawObject.stringValue("type") == "response.custom_tool_call_input.done") && typeState13Decoded
  val inputResult = rawObject["input"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val input = inputResult?.getOrNull()
  val inputDecoded = inputResult?.isSuccess == true
  val typeState14Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineBaseCustomToolCallInputDoneEventTypeX61c85e37>(element) } }
  val typeState14 = typeState14Result?.getOrNull()
  val typeState14Decoded = typeState14Result?.isSuccess == true
  val typeState14Matches = (rawObject.stringValue("type") == "response.custom_tool_call_input.done") && typeState14Decoded
  val typeState1Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineApplyPatchCallOperationDiffDeltaEventTypeX2a517bb3>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = (rawObject.stringValue("type") == "response.apply_patch_call_operation_diff.delta") && typeState1Decoded
  val typeState2Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineApplyPatchCallOperationDiffDeltaEventTypeX2a517bb3>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = (rawObject.stringValue("type") == "response.apply_patch_call_operation_diff.delta") && typeState2Decoded
  val typeState3Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineApplyPatchCallOperationDiffDoneEventTypeX82fcb82d>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = (rawObject.stringValue("type") == "response.apply_patch_call_operation_diff.done") && typeState3Decoded
  val diffResult = rawObject["diff"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val diff = diffResult?.getOrNull()
  val diffDecoded = diffResult?.isSuccess == true
  val typeState4Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineApplyPatchCallOperationDiffDoneEventTypeX82fcb82d>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val typeState4Matches = (rawObject.stringValue("type") == "response.apply_patch_call_operation_diff.done") && typeState4Decoded
  val typeState55Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFusionCallInProgressEventTypeXd4ded992>(element) } }
  val typeState55 = typeState55Result?.getOrNull()
  val typeState55Decoded = typeState55Result?.isSuccess == true
  val typeState55Matches = (rawObject.stringValue("type") == "response.fusion_call.in_progress") && typeState55Decoded
  val typeState56Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFusionCallInProgressEventTypeXd4ded992>(element) } }
  val typeState56 = typeState56Result?.getOrNull()
  val typeState56Decoded = typeState56Result?.isSuccess == true
  val typeState56Matches = (rawObject.stringValue("type") == "response.fusion_call.in_progress") && typeState56Decoded
  val typeState57Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFusionCallPanelAddedEventTypeXa7e7b6c6>(element) } }
  val typeState57 = typeState57Result?.getOrNull()
  val typeState57Decoded = typeState57Result?.isSuccess == true
  val typeState57Matches = (rawObject.stringValue("type") == "response.fusion_call.panel.added") && typeState57Decoded
  val modelResult = rawObject["model"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val model = modelResult?.getOrNull()
  val modelDecoded = modelResult?.isSuccess == true
  val typeState58Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFusionCallPanelAddedEventTypeXa7e7b6c6>(element) } }
  val typeState58 = typeState58Result?.getOrNull()
  val typeState58Decoded = typeState58Result?.isSuccess == true
  val typeState58Matches = (rawObject.stringValue("type") == "response.fusion_call.panel.added") && typeState58Decoded
  val typeState61Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFusionCallPanelDeltaEventTypeX8bdec444>(element) } }
  val typeState61 = typeState61Result?.getOrNull()
  val typeState61Decoded = typeState61Result?.isSuccess == true
  val typeState61Matches = (rawObject.stringValue("type") == "response.fusion_call.panel.delta") && typeState61Decoded
  val typeState62Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFusionCallPanelDeltaEventTypeX8bdec444>(element) } }
  val typeState62 = typeState62Result?.getOrNull()
  val typeState62Decoded = typeState62Result?.isSuccess == true
  val typeState62Matches = (rawObject.stringValue("type") == "response.fusion_call.panel.delta") && typeState62Decoded
  val typeState65Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFusionCallPanelReasoningDeltaEventTypeX6c55d981>(element) } }
  val typeState65 = typeState65Result?.getOrNull()
  val typeState65Decoded = typeState65Result?.isSuccess == true
  val typeState65Matches = (rawObject.stringValue("type") == "response.fusion_call.panel.reasoning.delta") && typeState65Decoded
  val typeState66Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFusionCallPanelReasoningDeltaEventTypeX6c55d981>(element) } }
  val typeState66 = typeState66Result?.getOrNull()
  val typeState66Decoded = typeState66Result?.isSuccess == true
  val typeState66Matches = (rawObject.stringValue("type") == "response.fusion_call.panel.reasoning.delta") && typeState66Decoded
  val typeState59Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFusionCallPanelCompletedEventTypeXccd0e5e6>(element) } }
  val typeState59 = typeState59Result?.getOrNull()
  val typeState59Decoded = typeState59Result?.isSuccess == true
  val typeState59Matches = (rawObject.stringValue("type") == "response.fusion_call.panel.completed") && typeState59Decoded
  val contentResult = rawObject["content"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val content = contentResult?.getOrNull()
  val contentDecoded = contentResult?.isSuccess == true
  val typeState60Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFusionCallPanelCompletedEventTypeXccd0e5e6>(element) } }
  val typeState60 = typeState60Result?.getOrNull()
  val typeState60Decoded = typeState60Result?.isSuccess == true
  val typeState60Matches = (rawObject.stringValue("type") == "response.fusion_call.panel.completed") && typeState60Decoded
  val typeState63Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFusionCallPanelFailedEventTypeXf84539ef>(element) } }
  val typeState63 = typeState63Result?.getOrNull()
  val typeState63Decoded = typeState63Result?.isSuccess == true
  val typeState63Matches = (rawObject.stringValue("type") == "response.fusion_call.panel.failed") && typeState63Decoded
  val errorResult = rawObject["error"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val error = errorResult?.getOrNull()
  val errorDecoded = errorResult?.isSuccess == true
  val typeState64Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFusionCallPanelFailedEventTypeXf84539ef>(element) } }
  val typeState64 = typeState64Result?.getOrNull()
  val typeState64Decoded = typeState64Result?.isSuccess == true
  val typeState64Matches = (rawObject.stringValue("type") == "response.fusion_call.panel.failed") && typeState64Decoded
  val typeState51Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFusionCallAnalysisInProgressEventTypeX56870346>(element) } }
  val typeState51 = typeState51Result?.getOrNull()
  val typeState51Decoded = typeState51Result?.isSuccess == true
  val typeState51Matches = (rawObject.stringValue("type") == "response.fusion_call.analysis.in_progress") && typeState51Decoded
  val judgeModelResult = rawObject["judge_model"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val judgeModel = judgeModelResult?.getOrNull()
  val judgeModelDecoded = judgeModelResult?.isSuccess == true
  val typeState52Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFusionCallAnalysisInProgressEventTypeX56870346>(element) } }
  val typeState52 = typeState52Result?.getOrNull()
  val typeState52Decoded = typeState52Result?.isSuccess == true
  val typeState52Matches = (rawObject.stringValue("type") == "response.fusion_call.analysis.in_progress") && typeState52Decoded
  val typeState49Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFusionCallAnalysisCompletedEventTypeX2230fa92>(element) } }
  val typeState49 = typeState49Result?.getOrNull()
  val typeState49Decoded = typeState49Result?.isSuccess == true
  val typeState49Matches = (rawObject.stringValue("type") == "response.fusion_call.analysis.completed") && typeState49Decoded
  val analysisResult = rawObject["analysis"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<FusionAnalysisResult>(element) } }
  val analysis = analysisResult?.getOrNull()
  val analysisDecoded = analysisResult?.isSuccess == true
  val typeState50Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFusionCallAnalysisCompletedEventTypeX2230fa92>(element) } }
  val typeState50 = typeState50Result?.getOrNull()
  val typeState50Decoded = typeState50Result?.isSuccess == true
  val typeState50Matches = (rawObject.stringValue("type") == "response.fusion_call.analysis.completed") && typeState50Decoded
  val typeState53Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFusionCallCompletedEventTypeX098a1518>(element) } }
  val typeState53 = typeState53Result?.getOrNull()
  val typeState53Decoded = typeState53Result?.isSuccess == true
  val typeState53Matches = (rawObject.stringValue("type") == "response.fusion_call.completed") && typeState53Decoded
  val typeState54Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFusionCallCompletedEventTypeX098a1518>(element) } }
  val typeState54 = typeState54Result?.getOrNull()
  val typeState54Decoded = typeState54Result?.isSuccess == true
  val typeState54Matches = (rawObject.stringValue("type") == "response.fusion_call.completed") && typeState54Decoded
  val typeState45Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineDebugEventTypeX9f7f544d>(element) } }
  val typeState45 = typeState45Result?.getOrNull()
  val typeState45Decoded = typeState45Result?.isSuccess == true
  val typeState45Matches = (rawObject.stringValue("type") == "response.debug") && typeState45Decoded
  val debugResult = rawObject["debug"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineDebugEventDebugX52571c89>(element) } }
  val debug = debugResult?.getOrNull()
  val debugDecoded = debugResult?.isSuccess == true
  val typeState46Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineDebugEventTypeX9f7f544d>(element) } }
  val typeState46 = typeState46Result?.getOrNull()
  val typeState46Decoded = typeState46Result?.isSuccess == true
  val typeState46Matches = (rawObject.stringValue("type") == "response.debug") && typeState46Decoded
  val rawEmpty = rawObject.isEmpty()
  val openResponsesCreatedEventMatches = matchesStreamEventsOpenResponsesCreatedEventBranch(rawObject) && (typeState43Matches)
  val openResponsesInProgressEventMatches = matchesStreamEventsOpenResponsesInProgressEventBranch(rawObject) && (typeState67Matches)
  val streamEventsResponseCompletedMatches = matchesStreamEventsStreamEventsResponseCompletedBranch(rawObject) && (typeState41Matches)
  val streamEventsResponseIncompleteMatches = matchesStreamEventsStreamEventsResponseIncompleteBranch(rawObject) && (typeState69Matches)
  val streamEventsResponseFailedMatches = matchesStreamEventsStreamEventsResponseFailedBranch(rawObject) && (typeState47Matches)
  val errorEventMatches = matchesStreamEventsErrorEventBranch(rawObject) && (typeState15Matches)
  val streamEventsResponseOutputItemAddedMatches = matchesStreamEventsStreamEventsResponseOutputItemAddedBranch(rawObject) && (typeState85Matches)
  val streamEventsResponseOutputItemDoneMatches = matchesStreamEventsStreamEventsResponseOutputItemDoneBranch(rawObject) && (typeState87Matches)
  val contentPartAddedEventMatches = matchesStreamEventsContentPartAddedEventBranch(rawObject) && (typeState7Matches)
  val contentPartDoneEventMatches = matchesStreamEventsContentPartDoneEventBranch(rawObject) && (typeState9Matches)
  val textDeltaEventMatches = matchesStreamEventsTextDeltaEventBranch(rawObject) && (typeState37Matches)
  val textDoneEventMatches = matchesStreamEventsTextDoneEventBranch(rawObject) && (typeState39Matches)
  val refusalDeltaEventMatches = matchesStreamEventsRefusalDeltaEventBranch(rawObject) && (typeState33Matches)
  val refusalDoneEventMatches = matchesStreamEventsRefusalDoneEventBranch(rawObject) && (typeState35Matches)
  val annotationAddedEventMatches = matchesStreamEventsAnnotationAddedEventBranch(rawObject) && (typeState5Matches)
  val functionCallArgsDeltaEventMatches = matchesStreamEventsFunctionCallArgsDeltaEventBranch(rawObject) && (typeState17Matches)
  val functionCallArgsDoneEventMatches = matchesStreamEventsFunctionCallArgsDoneEventBranch(rawObject) && (typeState19Matches)
  val reasoningDeltaEventMatches = matchesStreamEventsReasoningDeltaEventBranch(rawObject) && (typeState21Matches)
  val reasoningDoneEventMatches = matchesStreamEventsReasoningDoneEventBranch(rawObject) && (typeState23Matches)
  val reasoningSummaryPartAddedEventMatches = matchesStreamEventsReasoningSummaryPartAddedEventBranch(rawObject) && (typeState25Matches)
  val reasoningSummaryPartDoneEventMatches = matchesStreamEventsReasoningSummaryPartDoneEventBranch(rawObject) && (typeState27Matches)
  val reasoningSummaryTextDeltaEventMatches = matchesStreamEventsReasoningSummaryTextDeltaEventBranch(rawObject) && (typeState29Matches)
  val reasoningSummaryTextDoneEventMatches = matchesStreamEventsReasoningSummaryTextDoneEventBranch(rawObject) && (typeState31Matches)
  val imageGenCallInProgressEventMatches = matchesStreamEventsImageGenCallInProgressEventBranch(rawObject) && (typeState75Matches)
  val imageGenCallGeneratingEventMatches = matchesStreamEventsImageGenCallGeneratingEventBranch(rawObject) && (typeState73Matches)
  val imageGenCallPartialImageEventMatches = matchesStreamEventsImageGenCallPartialImageEventBranch(rawObject) && (typeState77Matches)
  val imageGenCallCompletedEventMatches = matchesStreamEventsImageGenCallCompletedEventBranch(rawObject) && (typeState71Matches)
  val webSearchCallInProgressEventMatches = matchesStreamEventsWebSearchCallInProgressEventBranch(rawObject) && (typeState81Matches)
  val webSearchCallSearchingEventMatches = matchesStreamEventsWebSearchCallSearchingEventBranch(rawObject) && (typeState83Matches)
  val webSearchCallCompletedEventMatches = matchesStreamEventsWebSearchCallCompletedEventBranch(rawObject) && (typeState79Matches)
  val customToolCallInputDeltaEventMatches = matchesStreamEventsCustomToolCallInputDeltaEventBranch(rawObject) && (typeState11Matches)
  val customToolCallInputDoneEventMatches = matchesStreamEventsCustomToolCallInputDoneEventBranch(rawObject) && (typeState13Matches)
  val applyPatchCallOperationDiffDeltaEventMatches = matchesStreamEventsApplyPatchCallOperationDiffDeltaEventBranch(rawObject) && (typeState1Matches)
  val applyPatchCallOperationDiffDoneEventMatches = matchesStreamEventsApplyPatchCallOperationDiffDoneEventBranch(rawObject) && (typeState3Matches)
  val fusionCallInProgressEventMatches = matchesStreamEventsFusionCallInProgressEventBranch(rawObject) && (typeState55Matches)
  val fusionCallPanelAddedEventMatches = matchesStreamEventsFusionCallPanelAddedEventBranch(rawObject) && (typeState57Matches)
  val fusionCallPanelDeltaEventMatches = matchesStreamEventsFusionCallPanelDeltaEventBranch(rawObject) && (typeState61Matches)
  val fusionCallPanelReasoningDeltaEventMatches = matchesStreamEventsFusionCallPanelReasoningDeltaEventBranch(rawObject) && (typeState65Matches)
  val fusionCallPanelCompletedEventMatches = matchesStreamEventsFusionCallPanelCompletedEventBranch(rawObject) && (typeState59Matches)
  val fusionCallPanelFailedEventMatches = matchesStreamEventsFusionCallPanelFailedEventBranch(rawObject) && (typeState63Matches)
  val fusionCallAnalysisInProgressEventMatches = matchesStreamEventsFusionCallAnalysisInProgressEventBranch(rawObject) && (typeState51Matches)
  val fusionCallAnalysisCompletedEventMatches = matchesStreamEventsFusionCallAnalysisCompletedEventBranch(rawObject) && (typeState49Matches)
  val fusionCallCompletedEventMatches = matchesStreamEventsFusionCallCompletedEventBranch(rawObject) && (typeState53Matches)
  val debugEventMatches = matchesStreamEventsDebugEventBranch(rawObject) && (typeState45Matches)
  val inspection = StreamEventsInspection()
  inspection.typeState43 = typeState43
  inspection.typeState43Decoded = typeState43Decoded
  inspection.typeState43Matches = typeState43Matches
  inspection.response = response
  inspection.responseDecoded = responseDecoded
  inspection.sequenceNumber = sequenceNumber
  inspection.sequenceNumberDecoded = sequenceNumberDecoded
  inspection.typeState44 = typeState44
  inspection.typeState44Decoded = typeState44Decoded
  inspection.typeState44Matches = typeState44Matches
  inspection.typeState67 = typeState67
  inspection.typeState67Decoded = typeState67Decoded
  inspection.typeState67Matches = typeState67Matches
  inspection.typeState68 = typeState68
  inspection.typeState68Decoded = typeState68Decoded
  inspection.typeState68Matches = typeState68Matches
  inspection.typeState41 = typeState41
  inspection.typeState41Decoded = typeState41Decoded
  inspection.typeState41Matches = typeState41Matches
  inspection.typeState42 = typeState42
  inspection.typeState42Decoded = typeState42Decoded
  inspection.typeState42Matches = typeState42Matches
  inspection.typeState69 = typeState69
  inspection.typeState69Decoded = typeState69Decoded
  inspection.typeState69Matches = typeState69Matches
  inspection.typeState70 = typeState70
  inspection.typeState70Decoded = typeState70Decoded
  inspection.typeState70Matches = typeState70Matches
  inspection.typeState47 = typeState47
  inspection.typeState47Decoded = typeState47Decoded
  inspection.typeState47Matches = typeState47Matches
  inspection.typeState48 = typeState48
  inspection.typeState48Decoded = typeState48Decoded
  inspection.typeState48Matches = typeState48Matches
  inspection.typeState15 = typeState15
  inspection.typeState15Decoded = typeState15Decoded
  inspection.typeState15Matches = typeState15Matches
  inspection.code = code
  inspection.codePresent = codePresent
  inspection.codeDecoded = codeDecoded
  inspection.message = message
  inspection.messageDecoded = messageDecoded
  inspection.param = param
  inspection.paramPresent = paramPresent
  inspection.paramDecoded = paramDecoded
  inspection.typeState16 = typeState16
  inspection.typeState16Decoded = typeState16Decoded
  inspection.typeState16Matches = typeState16Matches
  inspection.typeState85 = typeState85
  inspection.typeState85Decoded = typeState85Decoded
  inspection.typeState85Matches = typeState85Matches
  inspection.item = item
  inspection.itemDecoded = itemDecoded
  inspection.outputIndex = outputIndex
  inspection.outputIndexDecoded = outputIndexDecoded
  inspection.typeState86 = typeState86
  inspection.typeState86Decoded = typeState86Decoded
  inspection.typeState86Matches = typeState86Matches
  inspection.typeState87 = typeState87
  inspection.typeState87Decoded = typeState87Decoded
  inspection.typeState87Matches = typeState87Matches
  inspection.typeState88 = typeState88
  inspection.typeState88Decoded = typeState88Decoded
  inspection.typeState88Matches = typeState88Matches
  inspection.typeState7 = typeState7
  inspection.typeState7Decoded = typeState7Decoded
  inspection.typeState7Matches = typeState7Matches
  inspection.contentIndex = contentIndex
  inspection.contentIndexDecoded = contentIndexDecoded
  inspection.itemId = itemId
  inspection.itemIdDecoded = itemIdDecoded
  inspection.partState1 = partState1
  inspection.partState1Decoded = partState1Decoded
  inspection.typeState8 = typeState8
  inspection.typeState8Decoded = typeState8Decoded
  inspection.typeState8Matches = typeState8Matches
  inspection.typeState9 = typeState9
  inspection.typeState9Decoded = typeState9Decoded
  inspection.typeState9Matches = typeState9Matches
  inspection.partState2 = partState2
  inspection.partState2Decoded = partState2Decoded
  inspection.typeState10 = typeState10
  inspection.typeState10Decoded = typeState10Decoded
  inspection.typeState10Matches = typeState10Matches
  inspection.typeState37 = typeState37
  inspection.typeState37Decoded = typeState37Decoded
  inspection.typeState37Matches = typeState37Matches
  inspection.delta = delta
  inspection.deltaDecoded = deltaDecoded
  inspection.logprobs = logprobs
  inspection.logprobsDecoded = logprobsDecoded
  inspection.typeState38 = typeState38
  inspection.typeState38Decoded = typeState38Decoded
  inspection.typeState38Matches = typeState38Matches
  inspection.typeState39 = typeState39
  inspection.typeState39Decoded = typeState39Decoded
  inspection.typeState39Matches = typeState39Matches
  inspection.text = text
  inspection.textDecoded = textDecoded
  inspection.typeState40 = typeState40
  inspection.typeState40Decoded = typeState40Decoded
  inspection.typeState40Matches = typeState40Matches
  inspection.typeState33 = typeState33
  inspection.typeState33Decoded = typeState33Decoded
  inspection.typeState33Matches = typeState33Matches
  inspection.typeState34 = typeState34
  inspection.typeState34Decoded = typeState34Decoded
  inspection.typeState34Matches = typeState34Matches
  inspection.typeState35 = typeState35
  inspection.typeState35Decoded = typeState35Decoded
  inspection.typeState35Matches = typeState35Matches
  inspection.refusal = refusal
  inspection.refusalDecoded = refusalDecoded
  inspection.typeState36 = typeState36
  inspection.typeState36Decoded = typeState36Decoded
  inspection.typeState36Matches = typeState36Matches
  inspection.typeState5 = typeState5
  inspection.typeState5Decoded = typeState5Decoded
  inspection.typeState5Matches = typeState5Matches
  inspection.annotation = annotation
  inspection.annotationDecoded = annotationDecoded
  inspection.annotationIndex = annotationIndex
  inspection.annotationIndexDecoded = annotationIndexDecoded
  inspection.typeState6 = typeState6
  inspection.typeState6Decoded = typeState6Decoded
  inspection.typeState6Matches = typeState6Matches
  inspection.typeState17 = typeState17
  inspection.typeState17Decoded = typeState17Decoded
  inspection.typeState17Matches = typeState17Matches
  inspection.typeState18 = typeState18
  inspection.typeState18Decoded = typeState18Decoded
  inspection.typeState18Matches = typeState18Matches
  inspection.typeState19 = typeState19
  inspection.typeState19Decoded = typeState19Decoded
  inspection.typeState19Matches = typeState19Matches
  inspection.arguments = arguments
  inspection.argumentsDecoded = argumentsDecoded
  inspection.name = name
  inspection.nameDecoded = nameDecoded
  inspection.typeState20 = typeState20
  inspection.typeState20Decoded = typeState20Decoded
  inspection.typeState20Matches = typeState20Matches
  inspection.typeState21 = typeState21
  inspection.typeState21Decoded = typeState21Decoded
  inspection.typeState21Matches = typeState21Matches
  inspection.typeState22 = typeState22
  inspection.typeState22Decoded = typeState22Decoded
  inspection.typeState22Matches = typeState22Matches
  inspection.typeState23 = typeState23
  inspection.typeState23Decoded = typeState23Decoded
  inspection.typeState23Matches = typeState23Matches
  inspection.typeState24 = typeState24
  inspection.typeState24Decoded = typeState24Decoded
  inspection.typeState24Matches = typeState24Matches
  inspection.typeState25 = typeState25
  inspection.typeState25Decoded = typeState25Decoded
  inspection.typeState25Matches = typeState25Matches
  inspection.partState3 = partState3
  inspection.partState3Decoded = partState3Decoded
  inspection.summaryIndex = summaryIndex
  inspection.summaryIndexDecoded = summaryIndexDecoded
  inspection.typeState26 = typeState26
  inspection.typeState26Decoded = typeState26Decoded
  inspection.typeState26Matches = typeState26Matches
  inspection.typeState27 = typeState27
  inspection.typeState27Decoded = typeState27Decoded
  inspection.typeState27Matches = typeState27Matches
  inspection.typeState28 = typeState28
  inspection.typeState28Decoded = typeState28Decoded
  inspection.typeState28Matches = typeState28Matches
  inspection.typeState29 = typeState29
  inspection.typeState29Decoded = typeState29Decoded
  inspection.typeState29Matches = typeState29Matches
  inspection.typeState30 = typeState30
  inspection.typeState30Decoded = typeState30Decoded
  inspection.typeState30Matches = typeState30Matches
  inspection.typeState31 = typeState31
  inspection.typeState31Decoded = typeState31Decoded
  inspection.typeState31Matches = typeState31Matches
  inspection.typeState32 = typeState32
  inspection.typeState32Decoded = typeState32Decoded
  inspection.typeState32Matches = typeState32Matches
  inspection.typeState75 = typeState75
  inspection.typeState75Decoded = typeState75Decoded
  inspection.typeState75Matches = typeState75Matches
  inspection.typeState76 = typeState76
  inspection.typeState76Decoded = typeState76Decoded
  inspection.typeState76Matches = typeState76Matches
  inspection.typeState73 = typeState73
  inspection.typeState73Decoded = typeState73Decoded
  inspection.typeState73Matches = typeState73Matches
  inspection.typeState74 = typeState74
  inspection.typeState74Decoded = typeState74Decoded
  inspection.typeState74Matches = typeState74Matches
  inspection.typeState77 = typeState77
  inspection.typeState77Decoded = typeState77Decoded
  inspection.typeState77Matches = typeState77Matches
  inspection.partialImageB64 = partialImageB64
  inspection.partialImageB64Decoded = partialImageB64Decoded
  inspection.partialImageIndex = partialImageIndex
  inspection.partialImageIndexDecoded = partialImageIndexDecoded
  inspection.typeState78 = typeState78
  inspection.typeState78Decoded = typeState78Decoded
  inspection.typeState78Matches = typeState78Matches
  inspection.typeState71 = typeState71
  inspection.typeState71Decoded = typeState71Decoded
  inspection.typeState71Matches = typeState71Matches
  inspection.typeState72 = typeState72
  inspection.typeState72Decoded = typeState72Decoded
  inspection.typeState72Matches = typeState72Matches
  inspection.typeState81 = typeState81
  inspection.typeState81Decoded = typeState81Decoded
  inspection.typeState81Matches = typeState81Matches
  inspection.typeState82 = typeState82
  inspection.typeState82Decoded = typeState82Decoded
  inspection.typeState82Matches = typeState82Matches
  inspection.typeState83 = typeState83
  inspection.typeState83Decoded = typeState83Decoded
  inspection.typeState83Matches = typeState83Matches
  inspection.typeState84 = typeState84
  inspection.typeState84Decoded = typeState84Decoded
  inspection.typeState84Matches = typeState84Matches
  inspection.typeState79 = typeState79
  inspection.typeState79Decoded = typeState79Decoded
  inspection.typeState79Matches = typeState79Matches
  inspection.typeState80 = typeState80
  inspection.typeState80Decoded = typeState80Decoded
  inspection.typeState80Matches = typeState80Matches
  inspection.typeState11 = typeState11
  inspection.typeState11Decoded = typeState11Decoded
  inspection.typeState11Matches = typeState11Matches
  inspection.typeState12 = typeState12
  inspection.typeState12Decoded = typeState12Decoded
  inspection.typeState12Matches = typeState12Matches
  inspection.typeState13 = typeState13
  inspection.typeState13Decoded = typeState13Decoded
  inspection.typeState13Matches = typeState13Matches
  inspection.input = input
  inspection.inputDecoded = inputDecoded
  inspection.typeState14 = typeState14
  inspection.typeState14Decoded = typeState14Decoded
  inspection.typeState14Matches = typeState14Matches
  inspection.typeState1 = typeState1
  inspection.typeState1Decoded = typeState1Decoded
  inspection.typeState1Matches = typeState1Matches
  inspection.typeState2 = typeState2
  inspection.typeState2Decoded = typeState2Decoded
  inspection.typeState2Matches = typeState2Matches
  inspection.typeState3 = typeState3
  inspection.typeState3Decoded = typeState3Decoded
  inspection.typeState3Matches = typeState3Matches
  inspection.diff = diff
  inspection.diffDecoded = diffDecoded
  inspection.typeState4 = typeState4
  inspection.typeState4Decoded = typeState4Decoded
  inspection.typeState4Matches = typeState4Matches
  inspection.typeState55 = typeState55
  inspection.typeState55Decoded = typeState55Decoded
  inspection.typeState55Matches = typeState55Matches
  inspection.typeState56 = typeState56
  inspection.typeState56Decoded = typeState56Decoded
  inspection.typeState56Matches = typeState56Matches
  inspection.typeState57 = typeState57
  inspection.typeState57Decoded = typeState57Decoded
  inspection.typeState57Matches = typeState57Matches
  inspection.model = model
  inspection.modelDecoded = modelDecoded
  inspection.typeState58 = typeState58
  inspection.typeState58Decoded = typeState58Decoded
  inspection.typeState58Matches = typeState58Matches
  inspection.typeState61 = typeState61
  inspection.typeState61Decoded = typeState61Decoded
  inspection.typeState61Matches = typeState61Matches
  inspection.typeState62 = typeState62
  inspection.typeState62Decoded = typeState62Decoded
  inspection.typeState62Matches = typeState62Matches
  inspection.typeState65 = typeState65
  inspection.typeState65Decoded = typeState65Decoded
  inspection.typeState65Matches = typeState65Matches
  inspection.typeState66 = typeState66
  inspection.typeState66Decoded = typeState66Decoded
  inspection.typeState66Matches = typeState66Matches
  inspection.typeState59 = typeState59
  inspection.typeState59Decoded = typeState59Decoded
  inspection.typeState59Matches = typeState59Matches
  inspection.content = content
  inspection.contentDecoded = contentDecoded
  inspection.typeState60 = typeState60
  inspection.typeState60Decoded = typeState60Decoded
  inspection.typeState60Matches = typeState60Matches
  inspection.typeState63 = typeState63
  inspection.typeState63Decoded = typeState63Decoded
  inspection.typeState63Matches = typeState63Matches
  inspection.error = error
  inspection.errorDecoded = errorDecoded
  inspection.typeState64 = typeState64
  inspection.typeState64Decoded = typeState64Decoded
  inspection.typeState64Matches = typeState64Matches
  inspection.typeState51 = typeState51
  inspection.typeState51Decoded = typeState51Decoded
  inspection.typeState51Matches = typeState51Matches
  inspection.judgeModel = judgeModel
  inspection.judgeModelDecoded = judgeModelDecoded
  inspection.typeState52 = typeState52
  inspection.typeState52Decoded = typeState52Decoded
  inspection.typeState52Matches = typeState52Matches
  inspection.typeState49 = typeState49
  inspection.typeState49Decoded = typeState49Decoded
  inspection.typeState49Matches = typeState49Matches
  inspection.analysis = analysis
  inspection.analysisDecoded = analysisDecoded
  inspection.typeState50 = typeState50
  inspection.typeState50Decoded = typeState50Decoded
  inspection.typeState50Matches = typeState50Matches
  inspection.typeState53 = typeState53
  inspection.typeState53Decoded = typeState53Decoded
  inspection.typeState53Matches = typeState53Matches
  inspection.typeState54 = typeState54
  inspection.typeState54Decoded = typeState54Decoded
  inspection.typeState54Matches = typeState54Matches
  inspection.typeState45 = typeState45
  inspection.typeState45Decoded = typeState45Decoded
  inspection.typeState45Matches = typeState45Matches
  inspection.debug = debug
  inspection.debugDecoded = debugDecoded
  inspection.typeState46 = typeState46
  inspection.typeState46Decoded = typeState46Decoded
  inspection.typeState46Matches = typeState46Matches
  inspection.openResponsesCreatedEventMatches = openResponsesCreatedEventMatches
  inspection.openResponsesInProgressEventMatches = openResponsesInProgressEventMatches
  inspection.streamEventsResponseCompletedMatches = streamEventsResponseCompletedMatches
  inspection.streamEventsResponseIncompleteMatches = streamEventsResponseIncompleteMatches
  inspection.streamEventsResponseFailedMatches = streamEventsResponseFailedMatches
  inspection.errorEventMatches = errorEventMatches
  inspection.streamEventsResponseOutputItemAddedMatches = streamEventsResponseOutputItemAddedMatches
  inspection.streamEventsResponseOutputItemDoneMatches = streamEventsResponseOutputItemDoneMatches
  inspection.contentPartAddedEventMatches = contentPartAddedEventMatches
  inspection.contentPartDoneEventMatches = contentPartDoneEventMatches
  inspection.textDeltaEventMatches = textDeltaEventMatches
  inspection.textDoneEventMatches = textDoneEventMatches
  inspection.refusalDeltaEventMatches = refusalDeltaEventMatches
  inspection.refusalDoneEventMatches = refusalDoneEventMatches
  inspection.annotationAddedEventMatches = annotationAddedEventMatches
  inspection.functionCallArgsDeltaEventMatches = functionCallArgsDeltaEventMatches
  inspection.functionCallArgsDoneEventMatches = functionCallArgsDoneEventMatches
  inspection.reasoningDeltaEventMatches = reasoningDeltaEventMatches
  inspection.reasoningDoneEventMatches = reasoningDoneEventMatches
  inspection.reasoningSummaryPartAddedEventMatches = reasoningSummaryPartAddedEventMatches
  inspection.reasoningSummaryPartDoneEventMatches = reasoningSummaryPartDoneEventMatches
  inspection.reasoningSummaryTextDeltaEventMatches = reasoningSummaryTextDeltaEventMatches
  inspection.reasoningSummaryTextDoneEventMatches = reasoningSummaryTextDoneEventMatches
  inspection.imageGenCallInProgressEventMatches = imageGenCallInProgressEventMatches
  inspection.imageGenCallGeneratingEventMatches = imageGenCallGeneratingEventMatches
  inspection.imageGenCallPartialImageEventMatches = imageGenCallPartialImageEventMatches
  inspection.imageGenCallCompletedEventMatches = imageGenCallCompletedEventMatches
  inspection.webSearchCallInProgressEventMatches = webSearchCallInProgressEventMatches
  inspection.webSearchCallSearchingEventMatches = webSearchCallSearchingEventMatches
  inspection.webSearchCallCompletedEventMatches = webSearchCallCompletedEventMatches
  inspection.customToolCallInputDeltaEventMatches = customToolCallInputDeltaEventMatches
  inspection.customToolCallInputDoneEventMatches = customToolCallInputDoneEventMatches
  inspection.applyPatchCallOperationDiffDeltaEventMatches = applyPatchCallOperationDiffDeltaEventMatches
  inspection.applyPatchCallOperationDiffDoneEventMatches = applyPatchCallOperationDiffDoneEventMatches
  inspection.fusionCallInProgressEventMatches = fusionCallInProgressEventMatches
  inspection.fusionCallPanelAddedEventMatches = fusionCallPanelAddedEventMatches
  inspection.fusionCallPanelDeltaEventMatches = fusionCallPanelDeltaEventMatches
  inspection.fusionCallPanelReasoningDeltaEventMatches = fusionCallPanelReasoningDeltaEventMatches
  inspection.fusionCallPanelCompletedEventMatches = fusionCallPanelCompletedEventMatches
  inspection.fusionCallPanelFailedEventMatches = fusionCallPanelFailedEventMatches
  inspection.fusionCallAnalysisInProgressEventMatches = fusionCallAnalysisInProgressEventMatches
  inspection.fusionCallAnalysisCompletedEventMatches = fusionCallAnalysisCompletedEventMatches
  inspection.fusionCallCompletedEventMatches = fusionCallCompletedEventMatches
  inspection.debugEventMatches = debugEventMatches
  inspection.rawEmpty = rawEmpty
  inspection.failures = buildList {
    if (!openResponsesCreatedEventMatches) add("OpenResponsesCreatedEvent: branch predicate did not match properties 'type'")
    if (!openResponsesInProgressEventMatches) add("OpenResponsesInProgressEvent: branch predicate did not match properties 'type'")
    if (!streamEventsResponseCompletedMatches) add("StreamEventsResponseCompleted: branch predicate did not match properties 'type'")
    if (!streamEventsResponseIncompleteMatches) add("StreamEventsResponseIncomplete: branch predicate did not match properties 'type'")
    if (!streamEventsResponseFailedMatches) add("StreamEventsResponseFailed: branch predicate did not match properties 'type'")
    if (!errorEventMatches) add("ErrorEvent: branch predicate did not match properties 'type'")
    if (!streamEventsResponseOutputItemAddedMatches) add("StreamEventsResponseOutputItemAdded: branch predicate did not match properties 'type'")
    if (!streamEventsResponseOutputItemDoneMatches) add("StreamEventsResponseOutputItemDone: branch predicate did not match properties 'type'")
    if (!contentPartAddedEventMatches) add("ContentPartAddedEvent: branch predicate did not match properties 'type'")
    if (!contentPartDoneEventMatches) add("ContentPartDoneEvent: branch predicate did not match properties 'type'")
    if (!textDeltaEventMatches) add("TextDeltaEvent: branch predicate did not match properties 'type'")
    if (!textDoneEventMatches) add("TextDoneEvent: branch predicate did not match properties 'type'")
    if (!refusalDeltaEventMatches) add("RefusalDeltaEvent: branch predicate did not match properties 'type'")
    if (!refusalDoneEventMatches) add("RefusalDoneEvent: branch predicate did not match properties 'type'")
    if (!annotationAddedEventMatches) add("AnnotationAddedEvent: branch predicate did not match properties 'type'")
    if (!functionCallArgsDeltaEventMatches) add("FunctionCallArgsDeltaEvent: branch predicate did not match properties 'type'")
    if (!functionCallArgsDoneEventMatches) add("FunctionCallArgsDoneEvent: branch predicate did not match properties 'type'")
    if (!reasoningDeltaEventMatches) add("ReasoningDeltaEvent: branch predicate did not match properties 'type'")
    if (!reasoningDoneEventMatches) add("ReasoningDoneEvent: branch predicate did not match properties 'type'")
    if (!reasoningSummaryPartAddedEventMatches) add("ReasoningSummaryPartAddedEvent: branch predicate did not match properties 'type'")
    if (!reasoningSummaryPartDoneEventMatches) add("ReasoningSummaryPartDoneEvent: branch predicate did not match properties 'type'")
    if (!reasoningSummaryTextDeltaEventMatches) add("ReasoningSummaryTextDeltaEvent: branch predicate did not match properties 'type'")
    if (!reasoningSummaryTextDoneEventMatches) add("ReasoningSummaryTextDoneEvent: branch predicate did not match properties 'type'")
    if (!imageGenCallInProgressEventMatches) add("ImageGenCallInProgressEvent: branch predicate did not match properties 'type'")
    if (!imageGenCallGeneratingEventMatches) add("ImageGenCallGeneratingEvent: branch predicate did not match properties 'type'")
    if (!imageGenCallPartialImageEventMatches) add("ImageGenCallPartialImageEvent: branch predicate did not match properties 'type'")
    if (!imageGenCallCompletedEventMatches) add("ImageGenCallCompletedEvent: branch predicate did not match properties 'type'")
    if (!webSearchCallInProgressEventMatches) add("WebSearchCallInProgressEvent: branch predicate did not match properties 'type'")
    if (!webSearchCallSearchingEventMatches) add("WebSearchCallSearchingEvent: branch predicate did not match properties 'type'")
    if (!webSearchCallCompletedEventMatches) add("WebSearchCallCompletedEvent: branch predicate did not match properties 'type'")
    if (!customToolCallInputDeltaEventMatches) add("CustomToolCallInputDeltaEvent: branch predicate did not match properties 'type'")
    if (!customToolCallInputDoneEventMatches) add("CustomToolCallInputDoneEvent: branch predicate did not match properties 'type'")
    if (!applyPatchCallOperationDiffDeltaEventMatches) add("ApplyPatchCallOperationDiffDeltaEvent: branch predicate did not match properties 'type'")
    if (!applyPatchCallOperationDiffDoneEventMatches) add("ApplyPatchCallOperationDiffDoneEvent: branch predicate did not match properties 'type'")
    if (!fusionCallInProgressEventMatches) add("FusionCallInProgressEvent: branch predicate did not match properties 'type'")
    if (!fusionCallPanelAddedEventMatches) add("FusionCallPanelAddedEvent: branch predicate did not match properties 'type'")
    if (!fusionCallPanelDeltaEventMatches) add("FusionCallPanelDeltaEvent: branch predicate did not match properties 'type'")
    if (!fusionCallPanelReasoningDeltaEventMatches) add("FusionCallPanelReasoningDeltaEvent: branch predicate did not match properties 'type'")
    if (!fusionCallPanelCompletedEventMatches) add("FusionCallPanelCompletedEvent: branch predicate did not match properties 'type'")
    if (!fusionCallPanelFailedEventMatches) add("FusionCallPanelFailedEvent: branch predicate did not match properties 'type'")
    if (!fusionCallAnalysisInProgressEventMatches) add("FusionCallAnalysisInProgressEvent: branch predicate did not match properties 'type'")
    if (!fusionCallAnalysisCompletedEventMatches) add("FusionCallAnalysisCompletedEvent: branch predicate did not match properties 'type'")
    if (!fusionCallCompletedEventMatches) add("FusionCallCompletedEvent: branch predicate did not match properties 'type'")
    if (!debugEventMatches) add("DebugEvent: branch predicate did not match properties 'type'")
  }
  return inspection
}

private fun matchesStreamEventsOpenResponsesCreatedEventBranch(rawObject: JsonObject): Boolean = true

private fun matchesStreamEventsOpenResponsesInProgressEventBranch(rawObject: JsonObject): Boolean = true

private fun matchesStreamEventsStreamEventsResponseCompletedBranch(rawObject: JsonObject): Boolean = true

private fun matchesStreamEventsStreamEventsResponseIncompleteBranch(rawObject: JsonObject): Boolean = true

private fun matchesStreamEventsStreamEventsResponseFailedBranch(rawObject: JsonObject): Boolean = true

private fun matchesStreamEventsErrorEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("code") && rawObject.containsKey("message") && rawObject.containsKey("param") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["code"]?.let { property -> (property is JsonPrimitive && property.isString || property is JsonNull) } ?: true) && (rawObject["message"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["param"]?.let { property -> (property is JsonPrimitive && property.isString || property is JsonNull) } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"error\"")))) } ?: true)))

private fun matchesStreamEventsStreamEventsResponseOutputItemAddedBranch(rawObject: JsonObject): Boolean = true

private fun matchesStreamEventsStreamEventsResponseOutputItemDoneBranch(rawObject: JsonObject): Boolean = true

private fun matchesStreamEventsContentPartAddedEventBranch(rawObject: JsonObject): Boolean = true

private fun matchesStreamEventsContentPartDoneEventBranch(rawObject: JsonObject): Boolean = true

private fun matchesStreamEventsTextDeltaEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("content_index") && rawObject.containsKey("delta") && rawObject.containsKey("item_id") && rawObject.containsKey("logprobs") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["content_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["delta"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["logprobs"]?.let { property -> (property is JsonArray && (property.all { item -> (item is JsonObject && (item.containsKey("logprob") && item.containsKey("token") && (item["bytes"]?.let { property -> (property is JsonArray && (property.all { item -> item.isJsonSchemaInteger() })) } ?: true) && (item["logprob"]?.let { property -> property.isJsonSchemaNumber() } ?: true) && (item["token"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (item["top_logprobs"]?.let { property -> (property is JsonArray && (property.all { item -> (item is JsonObject && ((item["bytes"]?.let { property -> (property is JsonArray && (property.all { item -> item.isJsonSchemaInteger() })) } ?: true) && (item["logprob"]?.let { property -> property.isJsonSchemaNumber() } ?: true) && (item["token"]?.let { property -> property is JsonPrimitive && property.isString } ?: true))) })) } ?: true))) })) } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.output_text.delta\"")))) } ?: true)) && ((rawObject["logprobs"]?.let { property -> (property is JsonArray && (property.all { item -> (item is JsonObject && (item.containsKey("logprob") && item.containsKey("token") && (item["bytes"]?.let { property -> (property is JsonArray && (property.all { item -> item.isJsonSchemaInteger() })) } ?: true) && (item["logprob"]?.let { property -> property.isJsonSchemaNumber() } ?: true) && (item["token"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (item["top_logprobs"]?.let { property -> (property is JsonArray && (property.all { item -> (item is JsonObject && ((item["bytes"]?.let { property -> (property is JsonArray && (property.all { item -> item.isJsonSchemaInteger() })) } ?: true) && (item["logprob"]?.let { property -> property.isJsonSchemaNumber() } ?: true) && (item["token"]?.let { property -> property is JsonPrimitive && property.isString } ?: true))) })) } ?: true)) && ((item["top_logprobs"]?.let { property -> (property is JsonArray && (property.all { item -> (item is JsonObject && ((item["bytes"]?.let { property -> (property is JsonArray && (property.all { item -> item.isJsonSchemaInteger() })) } ?: true) && (item["logprob"]?.let { property -> property.isJsonSchemaNumber() } ?: true) && (item["token"]?.let { property -> property is JsonPrimitive && property.isString } ?: true))) })) } ?: true))) })) } ?: true)))

private fun matchesStreamEventsTextDoneEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("content_index") && rawObject.containsKey("item_id") && rawObject.containsKey("logprobs") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("text") && rawObject.containsKey("type") && (rawObject["content_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["logprobs"]?.let { property -> (property is JsonArray && (property.all { item -> (item is JsonObject && (item.containsKey("logprob") && item.containsKey("token") && (item["bytes"]?.let { property -> (property is JsonArray && (property.all { item -> item.isJsonSchemaInteger() })) } ?: true) && (item["logprob"]?.let { property -> property.isJsonSchemaNumber() } ?: true) && (item["token"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (item["top_logprobs"]?.let { property -> (property is JsonArray && (property.all { item -> (item is JsonObject && ((item["bytes"]?.let { property -> (property is JsonArray && (property.all { item -> item.isJsonSchemaInteger() })) } ?: true) && (item["logprob"]?.let { property -> property.isJsonSchemaNumber() } ?: true) && (item["token"]?.let { property -> property is JsonPrimitive && property.isString } ?: true))) })) } ?: true))) })) } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["text"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.output_text.done\"")))) } ?: true)) && ((rawObject["logprobs"]?.let { property -> (property is JsonArray && (property.all { item -> (item is JsonObject && (item.containsKey("logprob") && item.containsKey("token") && (item["bytes"]?.let { property -> (property is JsonArray && (property.all { item -> item.isJsonSchemaInteger() })) } ?: true) && (item["logprob"]?.let { property -> property.isJsonSchemaNumber() } ?: true) && (item["token"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (item["top_logprobs"]?.let { property -> (property is JsonArray && (property.all { item -> (item is JsonObject && ((item["bytes"]?.let { property -> (property is JsonArray && (property.all { item -> item.isJsonSchemaInteger() })) } ?: true) && (item["logprob"]?.let { property -> property.isJsonSchemaNumber() } ?: true) && (item["token"]?.let { property -> property is JsonPrimitive && property.isString } ?: true))) })) } ?: true)) && ((item["top_logprobs"]?.let { property -> (property is JsonArray && (property.all { item -> (item is JsonObject && ((item["bytes"]?.let { property -> (property is JsonArray && (property.all { item -> item.isJsonSchemaInteger() })) } ?: true) && (item["logprob"]?.let { property -> property.isJsonSchemaNumber() } ?: true) && (item["token"]?.let { property -> property is JsonPrimitive && property.isString } ?: true))) })) } ?: true))) })) } ?: true)))

private fun matchesStreamEventsRefusalDeltaEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("content_index") && rawObject.containsKey("delta") && rawObject.containsKey("item_id") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["content_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["delta"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.refusal.delta\"")))) } ?: true)))

private fun matchesStreamEventsRefusalDoneEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("content_index") && rawObject.containsKey("item_id") && rawObject.containsKey("output_index") && rawObject.containsKey("refusal") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["content_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["refusal"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.refusal.done\"")))) } ?: true)))

private fun matchesStreamEventsAnnotationAddedEventBranch(rawObject: JsonObject): Boolean = true

private fun matchesStreamEventsFunctionCallArgsDeltaEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("delta") && rawObject.containsKey("item_id") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["delta"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.function_call_arguments.delta\"")))) } ?: true)))

private fun matchesStreamEventsFunctionCallArgsDoneEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("arguments") && rawObject.containsKey("item_id") && rawObject.containsKey("name") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["arguments"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["name"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.function_call_arguments.done\"")))) } ?: true)))

private fun matchesStreamEventsReasoningDeltaEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("content_index") && rawObject.containsKey("delta") && rawObject.containsKey("item_id") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["content_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["delta"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.reasoning_text.delta\"")))) } ?: true)))

private fun matchesStreamEventsReasoningDoneEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("content_index") && rawObject.containsKey("item_id") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("text") && rawObject.containsKey("type") && (rawObject["content_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["text"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.reasoning_text.done\"")))) } ?: true)))

private fun matchesStreamEventsReasoningSummaryPartAddedEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("item_id") && rawObject.containsKey("output_index") && rawObject.containsKey("part") && rawObject.containsKey("sequence_number") && rawObject.containsKey("summary_index") && rawObject.containsKey("type") && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["part"]?.let { property -> (property is JsonObject && (property.containsKey("text") && property.containsKey("type") && (property["text"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (property["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"summary_text\"")))) } ?: true))) } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["summary_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.reasoning_summary_part.added\"")))) } ?: true)))

private fun matchesStreamEventsReasoningSummaryPartDoneEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("item_id") && rawObject.containsKey("output_index") && rawObject.containsKey("part") && rawObject.containsKey("sequence_number") && rawObject.containsKey("summary_index") && rawObject.containsKey("type") && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["part"]?.let { property -> (property is JsonObject && (property.containsKey("text") && property.containsKey("type") && (property["text"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (property["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"summary_text\"")))) } ?: true))) } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["summary_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.reasoning_summary_part.done\"")))) } ?: true)))

private fun matchesStreamEventsReasoningSummaryTextDeltaEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("delta") && rawObject.containsKey("item_id") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("summary_index") && rawObject.containsKey("type") && (rawObject["delta"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["summary_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.reasoning_summary_text.delta\"")))) } ?: true)))

private fun matchesStreamEventsReasoningSummaryTextDoneEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("item_id") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("summary_index") && rawObject.containsKey("text") && rawObject.containsKey("type") && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["summary_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["text"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.reasoning_summary_text.done\"")))) } ?: true)))

private fun matchesStreamEventsImageGenCallInProgressEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("item_id") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.image_generation_call.in_progress\"")))) } ?: true)))

private fun matchesStreamEventsImageGenCallGeneratingEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("item_id") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.image_generation_call.generating\"")))) } ?: true)))

private fun matchesStreamEventsImageGenCallPartialImageEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("item_id") && rawObject.containsKey("output_index") && rawObject.containsKey("partial_image_b64") && rawObject.containsKey("partial_image_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["partial_image_b64"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["partial_image_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.image_generation_call.partial_image\"")))) } ?: true)))

private fun matchesStreamEventsImageGenCallCompletedEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("item_id") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.image_generation_call.completed\"")))) } ?: true)))

private fun matchesStreamEventsWebSearchCallInProgressEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("item_id") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.web_search_call.in_progress\"")))) } ?: true)))

private fun matchesStreamEventsWebSearchCallSearchingEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("item_id") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.web_search_call.searching\"")))) } ?: true)))

private fun matchesStreamEventsWebSearchCallCompletedEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("item_id") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.web_search_call.completed\"")))) } ?: true)))

private fun matchesStreamEventsCustomToolCallInputDeltaEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("delta") && rawObject.containsKey("item_id") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["delta"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.custom_tool_call_input.delta\"")))) } ?: true)))

private fun matchesStreamEventsCustomToolCallInputDoneEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("input") && rawObject.containsKey("item_id") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["input"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.custom_tool_call_input.done\"")))) } ?: true)))

private fun matchesStreamEventsApplyPatchCallOperationDiffDeltaEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("delta") && rawObject.containsKey("item_id") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["delta"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.apply_patch_call_operation_diff.delta\"")))) } ?: true)))

private fun matchesStreamEventsApplyPatchCallOperationDiffDoneEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("diff") && rawObject.containsKey("item_id") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["diff"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.apply_patch_call_operation_diff.done\"")))) } ?: true)))

private fun matchesStreamEventsFusionCallInProgressEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("item_id") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.fusion_call.in_progress\"")))) } ?: true)))

private fun matchesStreamEventsFusionCallPanelAddedEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("item_id") && rawObject.containsKey("model") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["model"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.fusion_call.panel.added\"")))) } ?: true)))

private fun matchesStreamEventsFusionCallPanelDeltaEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("delta") && rawObject.containsKey("item_id") && rawObject.containsKey("model") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["delta"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["model"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.fusion_call.panel.delta\"")))) } ?: true)))

private fun matchesStreamEventsFusionCallPanelReasoningDeltaEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("delta") && rawObject.containsKey("item_id") && rawObject.containsKey("model") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["delta"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["model"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.fusion_call.panel.reasoning.delta\"")))) } ?: true)))

private fun matchesStreamEventsFusionCallPanelCompletedEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("content") && rawObject.containsKey("item_id") && rawObject.containsKey("model") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["content"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["model"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.fusion_call.panel.completed\"")))) } ?: true)))

private fun matchesStreamEventsFusionCallPanelFailedEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("error") && rawObject.containsKey("item_id") && rawObject.containsKey("model") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["error"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["model"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["status_code"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.fusion_call.panel.failed\"")))) } ?: true)))

private fun matchesStreamEventsFusionCallAnalysisInProgressEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("item_id") && rawObject.containsKey("judge_model") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["judge_model"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.fusion_call.analysis.in_progress\"")))) } ?: true)))

private fun matchesStreamEventsFusionCallAnalysisCompletedEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("analysis") && rawObject.containsKey("item_id") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["analysis"]?.let { property -> (property is JsonObject && (property.containsKey("blind_spots") && property.containsKey("consensus") && property.containsKey("contradictions") && property.containsKey("partial_coverage") && property.containsKey("unique_insights") && (property["blind_spots"]?.let { property -> (property is JsonArray && (property.all { item -> item is JsonPrimitive && item.isString })) } ?: true) && (property["consensus"]?.let { property -> (property is JsonArray && (property.all { item -> item is JsonPrimitive && item.isString })) } ?: true) && (property["contradictions"]?.let { property -> (property is JsonArray && (property.all { item -> (item is JsonObject && (item.containsKey("stances") && item.containsKey("topic") && (item["stances"]?.let { property -> (property is JsonArray && (property.all { item -> (item is JsonObject && (item.containsKey("model") && item.containsKey("stance") && (item["model"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (item["stance"]?.let { property -> property is JsonPrimitive && property.isString } ?: true))) })) } ?: true) && (item["topic"]?.let { property -> property is JsonPrimitive && property.isString } ?: true))) })) } ?: true) && (property["partial_coverage"]?.let { property -> (property is JsonArray && (property.all { item -> (item is JsonObject && (item.containsKey("models") && item.containsKey("point") && (item["models"]?.let { property -> (property is JsonArray && (property.all { item -> item is JsonPrimitive && item.isString })) } ?: true) && (item["point"]?.let { property -> property is JsonPrimitive && property.isString } ?: true))) })) } ?: true) && (property["unique_insights"]?.let { property -> (property is JsonArray && (property.all { item -> (item is JsonObject && (item.containsKey("insight") && item.containsKey("model") && (item["insight"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (item["model"]?.let { property -> property is JsonPrimitive && property.isString } ?: true))) })) } ?: true))) } ?: true) && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.fusion_call.analysis.completed\"")))) } ?: true)))

private fun matchesStreamEventsFusionCallCompletedEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("item_id") && rawObject.containsKey("output_index") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["item_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["output_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.fusion_call.completed\"")))) } ?: true)))

private fun matchesStreamEventsDebugEventBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("debug") && rawObject.containsKey("sequence_number") && rawObject.containsKey("type") && (rawObject["debug"]?.let { property -> (property is JsonObject && ((property["echo_upstream_body"]?.let { property -> (property is JsonObject && (property.all { (name, value) -> name in setOf<String>() || true })) } ?: true) && (property["timings"]?.let { property -> (property is JsonObject && (property.containsKey("epoch_ms") && property.containsKey("event") && property.containsKey("start_ms") && (property["epoch_ms"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (property["event"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"adapter_request\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"upstream_headers_received\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"first_token_received\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"upstream_body_ended\"")))) } ?: true) && (property["start_ms"]?.let { property -> property.isJsonSchemaInteger() } ?: true))) } ?: true))) } ?: true) && (rawObject["sequence_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response.debug\"")))) } ?: true)))

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
