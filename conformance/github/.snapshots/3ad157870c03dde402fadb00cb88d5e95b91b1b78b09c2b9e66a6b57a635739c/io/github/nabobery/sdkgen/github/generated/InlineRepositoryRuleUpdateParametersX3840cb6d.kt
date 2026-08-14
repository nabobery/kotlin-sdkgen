package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/repository-rule-update/properties/parameters.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-update/properties/parameters
 */
@Serializable(with = InlineRepositoryRuleUpdateParametersX3840cb6d.Serializer::class)
public class InlineRepositoryRuleUpdateParametersX3840cb6d(
  /**
   * Branch can pull changes from its upstream repository
   */
  public val updateAllowsFetchAndMerge: Boolean,
) {
  public class Builder {
    private var updateAllowsFetchAndMergeValue: Boolean? = null

    public var updateAllowsFetchAndMerge: Boolean
      get() = requireNotNull(updateAllowsFetchAndMergeValue) { "updateAllowsFetchAndMerge is required" }
      set(`value`) {
        updateAllowsFetchAndMergeValue = value
      }

    public fun build(): InlineRepositoryRuleUpdateParametersX3840cb6d {
      check(updateAllowsFetchAndMergeValue != null) { "updateAllowsFetchAndMerge is required" }
      return InlineRepositoryRuleUpdateParametersX3840cb6d(
        updateAllowsFetchAndMerge = updateAllowsFetchAndMerge,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRuleUpdateParametersX3840cb6d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleUpdateParametersX3840cb6d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleUpdateParametersX3840cb6d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRuleUpdateParametersX3840cb6d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRuleUpdateParametersX3840cb6d must be a JSON object")
      val updateAllowsFetchAndMerge = json.decodeRequired<Boolean>(rawObject, "update_allows_fetch_and_merge")
      return InlineRepositoryRuleUpdateParametersX3840cb6d(
        updateAllowsFetchAndMerge = updateAllowsFetchAndMerge,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleUpdateParametersX3840cb6d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRuleUpdateParametersX3840cb6d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("update_allows_fetch_and_merge", json.encodeToJsonElement(value.updateAllowsFetchAndMerge))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRuleUpdateParametersX3840cb6d(block: InlineRepositoryRuleUpdateParametersX3840cb6d.Builder.() -> Unit): InlineRepositoryRuleUpdateParametersX3840cb6d = InlineRepositoryRuleUpdateParametersX3840cb6d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryRuleUpdateParametersX3840cb6d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
