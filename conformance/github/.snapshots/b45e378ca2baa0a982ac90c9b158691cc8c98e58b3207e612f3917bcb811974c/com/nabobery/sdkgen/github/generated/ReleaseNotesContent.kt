package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated name and body describing a release
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/release-notes-content
 */
@Serializable(with = ReleaseNotesContent.Serializer::class)
public class ReleaseNotesContent(
  /**
   * The generated body describing the contents of the release supporting markdown formatting
   */
  public val body: String,
  /**
   * The generated name of the release
   */
  public val name: String,
) {
  public class Builder {
    private var bodyValue: String? = null

    public var body: String
      get() = requireNotNull(bodyValue) { "body is required" }
      set(`value`) {
        bodyValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): ReleaseNotesContent {
      check(bodyValue != null) { "body is required" }
      check(nameValue != null) { "name is required" }
      return ReleaseNotesContent(
        body = body,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ReleaseNotesContent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ReleaseNotesContent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ReleaseNotesContent {
      val jsonDecoder = decoder.requireJsonDecoder("ReleaseNotesContent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ReleaseNotesContent must be a JSON object")
      val body = json.decodeRequired<String>(rawObject, "body")
      val name = json.decodeRequired<String>(rawObject, "name")
      return ReleaseNotesContent(
        body = body,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ReleaseNotesContent) {
      val jsonEncoder = encoder.requireJsonEncoder("ReleaseNotesContent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("body", value.body)
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun releaseNotesContent(block: ReleaseNotesContent.Builder.() -> Unit): ReleaseNotesContent = ReleaseNotesContent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ReleaseNotesContent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
