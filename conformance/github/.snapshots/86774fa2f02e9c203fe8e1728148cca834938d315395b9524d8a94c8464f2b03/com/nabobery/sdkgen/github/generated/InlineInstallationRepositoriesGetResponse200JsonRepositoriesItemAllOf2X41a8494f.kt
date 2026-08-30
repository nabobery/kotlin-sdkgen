package com.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1installation~1repositories/get/responses/200/content/application~1json/schema/p
 * roperties/repositories/items/allOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1installation~1repositories/get/responses/200/content/application~1json/schema/p
 * roperties/repositories/items/allOf/1
 */
@Serializable(with = InlineInstallationRepositoriesGetResponse200JsonRepositoriesItemAllOf2X41a8494f.Serializer::class)
public class InlineInstallationRepositoriesGetResponse200JsonRepositoriesItemAllOf2X41a8494f(
  /**
   * The custom properties that were defined for the repository. The keys are the custom property names, and the values
   * are the corresponding custom property values. Present for org repos only.
   */
  public val customProperties: JsonObject? = null,
) {
  public class Builder {
    /**
     * The custom properties that were defined for the repository. The keys are the custom property names, and the
     * values are the corresponding custom property values. Present for org repos only.
     */
    public var customProperties: JsonObject? = null

    public fun build(): InlineInstallationRepositoriesGetResponse200JsonRepositoriesItemAllOf2X41a8494f = InlineInstallationRepositoriesGetResponse200JsonRepositoriesItemAllOf2X41a8494f(
      customProperties = customProperties,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineInstallationRepositoriesGetResponse200JsonRepositoriesItemAllOf2X41a8494f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineInstallationRepositoriesGetResponse200JsonRepositoriesItemAllOf2X41a8494f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInstallationRepositoriesGetResponse200JsonRepositoriesItemAllOf2X41a8494f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInstallationRepositoriesGetResponse200JsonRepositoriesItemAllOf2X41a8494f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineInstallationRepositoriesGetResponse200JsonRepositoriesItemAllOf2X41a8494f must be a JSON object")
      return InlineInstallationRepositoriesGetResponse200JsonRepositoriesItemAllOf2X41a8494f(
        customProperties = rawObject["custom_properties"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineInstallationRepositoriesGetResponse200JsonRepositoriesItemAllOf2X41a8494f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineInstallationRepositoriesGetResponse200JsonRepositoriesItemAllOf2X41a8494f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customProperties?.let { put("custom_properties", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineInstallationRepositoriesGetResponse200JsonRepositoriesItemAllOf2X41a8494f(block: InlineInstallationRepositoriesGetResponse200JsonRepositoriesItemAllOf2X41a8494f.Builder.() -> Unit): InlineInstallationRepositoriesGetResponse200JsonRepositoriesItemAllOf2X41a8494f = InlineInstallationRepositoriesGetResponse200JsonRepositoriesItemAllOf2X41a8494f.build(block)
