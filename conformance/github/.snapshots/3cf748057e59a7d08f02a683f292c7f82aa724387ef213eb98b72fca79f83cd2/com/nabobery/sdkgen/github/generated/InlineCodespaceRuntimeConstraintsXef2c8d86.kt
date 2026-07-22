package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/codespace/properties/runtime_constraints.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/codespace/properties/runtime_constraints
 */
@Serializable(with = InlineCodespaceRuntimeConstraintsXef2c8d86.Serializer::class)
public class InlineCodespaceRuntimeConstraintsXef2c8d86(
  /**
   * The privacy settings a user can select from when forwarding a port.
   */
  public val allowedPortPrivacySettings: List<String>? = null,
) {
  public class Builder {
    /**
     * The privacy settings a user can select from when forwarding a port.
     */
    public var allowedPortPrivacySettings: List<String>? = null

    public fun build(): InlineCodespaceRuntimeConstraintsXef2c8d86 = InlineCodespaceRuntimeConstraintsXef2c8d86(
      allowedPortPrivacySettings = allowedPortPrivacySettings,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCodespaceRuntimeConstraintsXef2c8d86 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineCodespaceRuntimeConstraintsXef2c8d86> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCodespaceRuntimeConstraintsXef2c8d86 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCodespaceRuntimeConstraintsXef2c8d86")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCodespaceRuntimeConstraintsXef2c8d86 must be a JSON object")
      return InlineCodespaceRuntimeConstraintsXef2c8d86(
        allowedPortPrivacySettings = rawObject["allowed_port_privacy_settings"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCodespaceRuntimeConstraintsXef2c8d86) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCodespaceRuntimeConstraintsXef2c8d86")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.allowedPortPrivacySettings?.let { put("allowed_port_privacy_settings", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCodespaceRuntimeConstraintsXef2c8d86(block: InlineCodespaceRuntimeConstraintsXef2c8d86.Builder.() -> Unit): InlineCodespaceRuntimeConstraintsXef2c8d86 = InlineCodespaceRuntimeConstraintsXef2c8d86.build(block)
