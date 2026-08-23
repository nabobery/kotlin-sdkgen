package com.nabobery.sdkgen.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ShellCallOutputItem/properties/output/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ShellCallOutputItem/properties/output/items
 */
@Serializable(with = InlineShellCallOutputItemOutputItemX955a2a22.Serializer::class)
public class InlineShellCallOutputItemOutputItemX955a2a22(
  public val type: String,
  public val content: String? = null,
  public val exitCode: Int? = null,
  additionalProperties: Map<String, JsonElement> = emptyMap(),
) {
  /**
   * Additional JSON object members not declared as fixed properties.
   */
  public val additionalProperties: Map<String, JsonElement> =
      copyAndValidateInlineShellCallOutputItemOutputItemX955a2a22AdditionalProperties(additionalProperties)

  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var content: String? = null

    public var exitCode: Int? = null

    private var additionalPropertiesValue: Map<String, JsonElement> = emptyMap()

    /**
     * Additional JSON object members not declared as fixed properties.
     */
    public var additionalProperties: Map<String, JsonElement>
      get() = additionalPropertiesValue.toMap()
      set(`value`) {
        additionalPropertiesValue = value.toMap()
      }

    public fun build(): InlineShellCallOutputItemOutputItemX955a2a22 {
      check(typeValue != null) { "type is required" }
      return InlineShellCallOutputItemOutputItemX955a2a22(
        type = type,
        content = content,
        exitCode = exitCode,
        additionalProperties = additionalProperties,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineShellCallOutputItemOutputItemX955a2a22 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineShellCallOutputItemOutputItemX955a2a22> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineShellCallOutputItemOutputItemX955a2a22 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineShellCallOutputItemOutputItemX955a2a22")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineShellCallOutputItemOutputItemX955a2a22 must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      return InlineShellCallOutputItemOutputItemX955a2a22(
        type = type,
        content = rawObject["content"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        exitCode = rawObject["exit_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        additionalProperties = rawObject.filterKeys { key -> key !in setOf("content", "exit_code", "type") }.mapValues { (_, element) -> element }.toMap(),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineShellCallOutputItemOutputItemX955a2a22) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineShellCallOutputItemOutputItemX955a2a22")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
        value.content?.let { put("content", it) }
        value.exitCode?.let { put("exit_code", json.encodeToJsonElement(it)) }
        value.additionalProperties.keys.sorted().forEach { key ->
          val additionalValue = value.additionalProperties.getValue(key)
          check(key !in setOf("content", "exit_code", "type")) { "InlineShellCallOutputItemOutputItemX955a2a22 additionalProperties key '" + key + "' collides with a fixed property" }
          put(key, additionalValue)
        }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

private fun copyAndValidateInlineShellCallOutputItemOutputItemX955a2a22AdditionalProperties(additionalProperties: Map<String, JsonElement>): Map<String, JsonElement> {
  val copied = additionalProperties.toMap()
  val collision = copied.keys.sorted().firstOrNull { key -> key in setOf("content", "exit_code", "type") }
  require(collision == null) { "InlineShellCallOutputItemOutputItemX955a2a22 additionalProperties key '" + collision + "' collides with a fixed property" }
  return copied
}

public fun inlineShellCallOutputItemOutputItemX955a2a22(block: InlineShellCallOutputItemOutputItemX955a2a22.Builder.() -> Unit): InlineShellCallOutputItemOutputItemX955a2a22 = InlineShellCallOutputItemOutputItemX955a2a22.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineShellCallOutputItemOutputItemX955a2a22 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
