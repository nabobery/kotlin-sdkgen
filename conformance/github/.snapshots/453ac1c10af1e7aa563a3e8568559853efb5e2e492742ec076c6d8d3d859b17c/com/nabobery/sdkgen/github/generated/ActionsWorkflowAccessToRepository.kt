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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/actions-workflow-access-to-repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-workflow-access-to-repository
 */
@Serializable(with = ActionsWorkflowAccessToRepository.Serializer::class)
public class ActionsWorkflowAccessToRepository(
  /**
   * Defines the level of access that workflows outside of the repository have to actions and reusable workflows within
   * the
   * repository.
   *
   * `none` means the access is only possible from workflows in this repository. `user` level access allows sharing
   * across user owned private repositories only. `organization` level access allows sharing across the organization.
   */
  public val accessLevel: InlineActionsWorkflowAccessToRepositoryAccessLevelXb7270774,
) {
  public class Builder {
    private var accessLevelValue: InlineActionsWorkflowAccessToRepositoryAccessLevelXb7270774? =
        null

    public var accessLevel: InlineActionsWorkflowAccessToRepositoryAccessLevelXb7270774
      get() = requireNotNull(accessLevelValue) { "accessLevel is required" }
      set(`value`) {
        accessLevelValue = value
      }

    public fun build(): ActionsWorkflowAccessToRepository {
      check(accessLevelValue != null) { "accessLevel is required" }
      return ActionsWorkflowAccessToRepository(
        accessLevel = accessLevel,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsWorkflowAccessToRepository = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ActionsWorkflowAccessToRepository> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsWorkflowAccessToRepository {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsWorkflowAccessToRepository")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsWorkflowAccessToRepository must be a JSON object")
      val accessLevel = json.decodeRequired<InlineActionsWorkflowAccessToRepositoryAccessLevelXb7270774>(rawObject, "access_level")
      return ActionsWorkflowAccessToRepository(
        accessLevel = accessLevel,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsWorkflowAccessToRepository) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsWorkflowAccessToRepository")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("access_level", json.encodeToJsonElement(value.accessLevel))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsWorkflowAccessToRepository(block: ActionsWorkflowAccessToRepository.Builder.() -> Unit): ActionsWorkflowAccessToRepository = ActionsWorkflowAccessToRepository.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ActionsWorkflowAccessToRepository is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
