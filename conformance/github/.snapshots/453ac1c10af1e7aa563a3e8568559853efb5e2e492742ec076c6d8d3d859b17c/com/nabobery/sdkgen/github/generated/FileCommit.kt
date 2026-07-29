package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * File Commit
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/file-commit
 */
@Serializable(with = FileCommit.Serializer::class)
public class FileCommit(
  public val commit: InlineFileCommitCommitX999df49b,
  public val content: InlineFileCommitContentXbcf7f41c?,
) {
  public class Builder {
    private var commitValue: InlineFileCommitCommitX999df49b? = null

    public var commit: InlineFileCommitCommitX999df49b
      get() = requireNotNull(commitValue) { "commit is required" }
      set(`value`) {
        commitValue = value
      }

    private var contentState: FieldState<InlineFileCommitContentXbcf7f41c?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var content: InlineFileCommitContentXbcf7f41c?
      get() = contentState.valueOrNull()
      set(`value`) {
        contentState = value.toNullableFieldState()
      }

    public fun build(): FileCommit {
      check(commitValue != null) { "commit is required" }
      check(contentState !== FieldState.Absent) { "content is required, even when null" }
      return FileCommit(
        commit = commit,
        content = contentState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FileCommit = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<FileCommit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FileCommit {
      val jsonDecoder = decoder.requireJsonDecoder("FileCommit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FileCommit must be a JSON object")
      val commit = json.decodeRequired<InlineFileCommitCommitX999df49b>(rawObject, "commit")
      if (!rawObject.containsKey("content")) {
        throw SerializationException("FileCommit is missing required property 'content'")
      }
      val content = rawObject["content"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineFileCommitContentXbcf7f41c?>(requireNotNull(element)) }
      return FileCommit(
        commit = commit,
        content = content,
      )
    }

    override fun serialize(encoder: Encoder, `value`: FileCommit) {
      val jsonEncoder = encoder.requireJsonEncoder("FileCommit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("commit", json.encodeToJsonElement(value.commit))
        put("content", value.content?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fileCommit(block: FileCommit.Builder.() -> Unit): FileCommit = FileCommit.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FileCommit is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("FileCommit property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
