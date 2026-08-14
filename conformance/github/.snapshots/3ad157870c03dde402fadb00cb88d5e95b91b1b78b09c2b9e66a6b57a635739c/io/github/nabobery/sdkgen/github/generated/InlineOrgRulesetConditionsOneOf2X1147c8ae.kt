package io.github.nabobery.sdkgen.github.generated

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
 * Conditions to target repositories by id and refs by name
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/org-ruleset-conditions/oneOf/1
 */
@Serializable(with = InlineOrgRulesetConditionsOneOf2X1147c8ae.Serializer::class)
public class InlineOrgRulesetConditionsOneOf2X1147c8ae(
  public val repositoryId: InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2,
  public val refName: InlineRepositoryRulesetConditionsRefNameX4b3789e8? = null,
) {
  public class Builder {
    private var repositoryIdValue:
        InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2? = null

    public var repositoryId:
        InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2
      get() = requireNotNull(repositoryIdValue) { "repositoryId is required" }
      set(`value`) {
        repositoryIdValue = value
      }

    public var refName: InlineRepositoryRulesetConditionsRefNameX4b3789e8? = null

    public fun build(): InlineOrgRulesetConditionsOneOf2X1147c8ae {
      check(repositoryIdValue != null) { "repositoryId is required" }
      return InlineOrgRulesetConditionsOneOf2X1147c8ae(
        repositoryId = repositoryId,
        refName = refName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgRulesetConditionsOneOf2X1147c8ae = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgRulesetConditionsOneOf2X1147c8ae> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgRulesetConditionsOneOf2X1147c8ae {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgRulesetConditionsOneOf2X1147c8ae")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgRulesetConditionsOneOf2X1147c8ae must be a JSON object")
      val repositoryId = json.decodeRequired<InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2>(rawObject, "repository_id")
      return InlineOrgRulesetConditionsOneOf2X1147c8ae(
        repositoryId = repositoryId,
        refName = rawObject["ref_name"]?.let { json.decodeFromJsonElement<InlineRepositoryRulesetConditionsRefNameX4b3789e8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgRulesetConditionsOneOf2X1147c8ae) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgRulesetConditionsOneOf2X1147c8ae")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("repository_id", json.encodeToJsonElement(value.repositoryId))
        value.refName?.let { put("ref_name", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgRulesetConditionsOneOf2X1147c8ae(block: InlineOrgRulesetConditionsOneOf2X1147c8ae.Builder.() -> Unit): InlineOrgRulesetConditionsOneOf2X1147c8ae = InlineOrgRulesetConditionsOneOf2X1147c8ae.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgRulesetConditionsOneOf2X1147c8ae is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
