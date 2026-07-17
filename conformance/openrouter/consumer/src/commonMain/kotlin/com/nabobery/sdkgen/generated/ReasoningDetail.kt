package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.put

public sealed class UnionDecodingException(
  message: String,
) : SerializationException(message)

public class OneOfNoMatchException(
  message: String,
) : UnionDecodingException(message)

public class OneOfAmbiguityException(
  message: String,
) : UnionDecodingException(message)

/**
 * Reasoning detail union schema
 */
@Serializable(with = ReasoningDetail.Serializer::class)
public sealed interface ReasoningDetail {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class Summary internal constructor(
    public val summary: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ReasoningDetail {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(summary: String): Summary = Summary(
        summary = summary,
        raw = buildJsonObject {
          put("type", "reasoning.summary")
          put("summary", summary)
        },
      )
    }
  }

  public class Encrypted internal constructor(
    public val `data`: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ReasoningDetail {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(`data`: String): Encrypted = Encrypted(
        data = data,
        raw = buildJsonObject {
          put("type", "reasoning.encrypted")
          put("data", data)
        },
      )
    }
  }

  public class Text internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ReasoningDetail {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(): Text = Text(
        raw = buildJsonObject {
          put("type", "reasoning.text")
        },
      )
    }
  }

  public class ServerToolCall internal constructor(
    public val arguments: String,
    public val result: String,
    public val toolName: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ReasoningDetail {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        arguments: String,
        result: String,
        toolName: String,
      ): ServerToolCall = ServerToolCall(
        arguments = arguments,
        result = result,
        toolName = toolName,
        raw = buildJsonObject {
          put("type", "reasoning.server_tool_call")
          put("arguments", arguments)
          put("result", result)
          put("tool_name", toolName)
        },
      )
    }
  }

  public object Serializer : KSerializer<ReasoningDetail> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ReasoningDetail {
      val jsonDecoder = decoder.requireJsonDecoder("ReasoningDetail")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw OneOfNoMatchException("ReasoningDetail matched 0 branches: expected JSON object")
      val matches = inspectReasoningDetail(raw)
      if (matches.size == 0) {
        throw OneOfNoMatchException("ReasoningDetail matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw OneOfAmbiguityException("ReasoningDetail matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.type == "reasoning.summary" && matches.summary != null -> Summary(summary = requireNotNull(matches.summary), raw = raw)
        matches.type == "reasoning.encrypted" && matches.data != null -> Encrypted(data = requireNotNull(matches.data), raw = raw)
        matches.type == "reasoning.text" -> Text(raw = raw)
        matches.type == "reasoning.server_tool_call" && matches.arguments != null && matches.result != null && matches.toolName != null -> ServerToolCall(arguments = requireNotNull(matches.arguments), result = requireNotNull(matches.result), toolName = requireNotNull(matches.toolName), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: ReasoningDetail) {
      encoder.requireJsonEncoder("ReasoningDetail").encodeJsonElement(value.raw)
    }
  }
}

private data class ReasoningDetailInspection(
  public val type: String?,
  public val summary: String?,
  public val `data`: String?,
  public val arguments: String?,
  public val result: String?,
  public val toolName: String?,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (type == "reasoning.summary" && summary != null) add("Summary")
      if (type == "reasoning.encrypted" && data != null) add("Encrypted")
      if (type == "reasoning.text") add("Text")
      if (type == "reasoning.server_tool_call" && arguments != null && result != null && toolName != null) add("ServerToolCall")
    }

  public val size: Int
    get() = names.size
}

private fun inspectReasoningDetail(raw: JsonObject): ReasoningDetailInspection {
  val type = raw.stringValue("type")
  val summary = raw.stringValue("summary")
  val data = raw.stringValue("data")
  val arguments = raw.stringValue("arguments")
  val result = raw.stringValue("result")
  val toolName = raw.stringValue("tool_name")
  return ReasoningDetailInspection(
    type = type,
    summary = summary,
    data = data,
    arguments = arguments,
    result = result,
    toolName = toolName,
    failures = buildList {
      if (!(type == "reasoning.summary") || summary == null) add("Summary: required properties 'type' and 'summary' must be strings")
      if (!(type == "reasoning.encrypted") || data == null) add("Encrypted: required properties 'type' and 'data' must be strings")
      if (!(type == "reasoning.text")) add("Text: required properties 'type' must be strings")
      if (!(type == "reasoning.server_tool_call") || arguments == null || result == null || toolName == null) add("ServerToolCall: required properties 'type' and 'arguments' and 'result' and 'tool_name' must be strings")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
