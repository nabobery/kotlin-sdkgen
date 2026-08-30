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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/codespace-with-full-repository/properties/runtime_constraints.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/codespace-with-full-repository/properties/runtime_constraints
 */
@Serializable(with = InlineCodespaceWithFullRepositoryRuntimeConstraintsX879d095d.Serializer::class)
public class InlineCodespaceWithFullRepositoryRuntimeConstraintsX879d095d(
  allowedPortPrivacySettings: List<String>? = null,
) {
  /**
   * The privacy settings a user can select from when forwarding a port.
   */
  public val allowedPortPrivacySettings: List<String>? =
      allowedPortPrivacySettings?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var allowedPortPrivacySettingsValue: List<String>? = null

    /**
     * The privacy settings a user can select from when forwarding a port.
     */
    public var allowedPortPrivacySettings: List<String>?
      get() = allowedPortPrivacySettingsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedPortPrivacySettingsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineCodespaceWithFullRepositoryRuntimeConstraintsX879d095d = InlineCodespaceWithFullRepositoryRuntimeConstraintsX879d095d(
      allowedPortPrivacySettings = allowedPortPrivacySettings,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCodespaceWithFullRepositoryRuntimeConstraintsX879d095d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCodespaceWithFullRepositoryRuntimeConstraintsX879d095d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCodespaceWithFullRepositoryRuntimeConstraintsX879d095d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCodespaceWithFullRepositoryRuntimeConstraintsX879d095d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCodespaceWithFullRepositoryRuntimeConstraintsX879d095d must be a JSON object")
      return InlineCodespaceWithFullRepositoryRuntimeConstraintsX879d095d(
        allowedPortPrivacySettings = rawObject["allowed_port_privacy_settings"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCodespaceWithFullRepositoryRuntimeConstraintsX879d095d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCodespaceWithFullRepositoryRuntimeConstraintsX879d095d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.allowedPortPrivacySettings?.let { put("allowed_port_privacy_settings", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCodespaceWithFullRepositoryRuntimeConstraintsX879d095d(block: InlineCodespaceWithFullRepositoryRuntimeConstraintsX879d095d.Builder.() -> Unit): InlineCodespaceWithFullRepositoryRuntimeConstraintsX879d095d = InlineCodespaceWithFullRepositoryRuntimeConstraintsX879d095d.build(block)
