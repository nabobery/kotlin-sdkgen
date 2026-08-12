package com.nabobery.sdkgen.github.generated

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
 * Information about repositories that Dependabot is able to access in an organization
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependabot-repository-access-details
 */
@Serializable(with = DependabotRepositoryAccessDetails.Serializer::class)
public class DependabotRepositoryAccessDetails(
  accessibleRepositories: List<NullableSimpleRepository?>? = null,
  /**
   * The default repository access level for Dependabot updates.
   */
  public val defaultLevel: InlineDependabotRepositoryAccessDetailsDefaultLevelX9ea82144? = null,
) {
  public val accessibleRepositories: List<NullableSimpleRepository?>? =
      accessibleRepositories?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var accessibleRepositoriesValue: List<NullableSimpleRepository?>? = null

    public var accessibleRepositories: List<NullableSimpleRepository?>?
      get() = accessibleRepositoriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        accessibleRepositoriesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The default repository access level for Dependabot updates.
     */
    public var defaultLevel: InlineDependabotRepositoryAccessDetailsDefaultLevelX9ea82144? = null

    public fun build(): DependabotRepositoryAccessDetails = DependabotRepositoryAccessDetails(
      accessibleRepositories = accessibleRepositories,
      defaultLevel = defaultLevel,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DependabotRepositoryAccessDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DependabotRepositoryAccessDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DependabotRepositoryAccessDetails {
      val jsonDecoder = decoder.requireJsonDecoder("DependabotRepositoryAccessDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DependabotRepositoryAccessDetails must be a JSON object")
      return DependabotRepositoryAccessDetails(
        accessibleRepositories = rawObject["accessible_repositories"]?.let { json.decodeFromJsonElement<List<NullableSimpleRepository?>>(it) },
        defaultLevel = rawObject["default_level"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineDependabotRepositoryAccessDetailsDefaultLevelX9ea82144?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: DependabotRepositoryAccessDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("DependabotRepositoryAccessDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accessibleRepositories?.let { put("accessible_repositories", json.encodeToJsonElement(it)) }
        value.defaultLevel?.let { put("default_level", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun dependabotRepositoryAccessDetails(block: DependabotRepositoryAccessDetails.Builder.() -> Unit): DependabotRepositoryAccessDetails = DependabotRepositoryAccessDetails.build(block)
