package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Configuration for the openrouter:files server tool
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FilesServerToolConfig
 */
@Serializable(with = FilesServerToolConfig.Serializer::class)
public class FilesServerToolConfig(
  /**
   * Allow the model to create and edit files (the `write` and `edit` operations). Defaults to false: without an
   * explicit opt-in the tool is read-only, so prompt injection or untrusted file content cannot mutate workspace
   * storage.
   */
  public val allowWrites: Boolean? = null,
) {
  public class Builder {
    /**
     * Allow the model to create and edit files (the `write` and `edit` operations). Defaults to false: without an
     * explicit opt-in the tool is read-only, so prompt injection or untrusted file content cannot mutate workspace
     * storage.
     */
    public var allowWrites: Boolean? = null

    public fun build(): FilesServerToolConfig = FilesServerToolConfig(
      allowWrites = allowWrites,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FilesServerToolConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FilesServerToolConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FilesServerToolConfig {
      val jsonDecoder = decoder.requireJsonDecoder("FilesServerToolConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FilesServerToolConfig must be a JSON object")
      return FilesServerToolConfig(
        allowWrites = rawObject["allow_writes"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: FilesServerToolConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("FilesServerToolConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.allowWrites?.let { put("allow_writes", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun filesServerToolConfig(block: FilesServerToolConfig.Builder.() -> Unit): FilesServerToolConfig = FilesServerToolConfig.build(block)
