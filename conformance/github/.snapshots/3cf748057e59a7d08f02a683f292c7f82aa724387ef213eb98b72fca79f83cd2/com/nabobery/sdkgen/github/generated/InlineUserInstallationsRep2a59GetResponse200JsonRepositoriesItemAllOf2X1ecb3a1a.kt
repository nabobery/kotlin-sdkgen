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
 * sdkgen://source/openapi.yaml#/paths/~1user~1installations~1{installation_id}~1repositories/get/responses/200/content/
 * application~1json/schema/properties/repositories/items/allOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1installations~1{installation_id}~1repositories/get/responses/200/content/
 * application~1json/schema/properties/repositories/items/allOf/1
 */
@Serializable(with = InlineUserInstallationsRep2a59GetResponse200JsonRepositoriesItemAllOf2X1ecb3a1a.Serializer::class)
public class InlineUserInstallationsRep2a59GetResponse200JsonRepositoriesItemAllOf2X1ecb3a1a(
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

    public fun build(): InlineUserInstallationsRep2a59GetResponse200JsonRepositoriesItemAllOf2X1ecb3a1a = InlineUserInstallationsRep2a59GetResponse200JsonRepositoriesItemAllOf2X1ecb3a1a(
      customProperties = customProperties,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserInstallationsRep2a59GetResponse200JsonRepositoriesItemAllOf2X1ecb3a1a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineUserInstallationsRep2a59GetResponse200JsonRepositoriesItemAllOf2X1ecb3a1a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserInstallationsRep2a59GetResponse200JsonRepositoriesItemAllOf2X1ecb3a1a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserInstallationsRep2a59GetResponse200JsonRepositoriesItemAllOf2X1ecb3a1a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserInstallationsRep2a59GetResponse200JsonRepositoriesItemAllOf2X1ecb3a1a must be a JSON object")
      return InlineUserInstallationsRep2a59GetResponse200JsonRepositoriesItemAllOf2X1ecb3a1a(
        customProperties = rawObject["custom_properties"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserInstallationsRep2a59GetResponse200JsonRepositoriesItemAllOf2X1ecb3a1a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserInstallationsRep2a59GetResponse200JsonRepositoriesItemAllOf2X1ecb3a1a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customProperties?.let { put("custom_properties", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUserInstallationsRep2a59GetResponse200JsonRepositoriesItemAllOf2X1ecb3a1a(block: InlineUserInstallationsRep2a59GetResponse200JsonRepositoriesItemAllOf2X1ecb3a1a.Builder.() -> Unit): InlineUserInstallationsRep2a59GetResponse200JsonRepositoriesItemAllOf2X1ecb3a1a = InlineUserInstallationsRep2a59GetResponse200JsonRepositoriesItemAllOf2X1ecb3a1a.build(block)
