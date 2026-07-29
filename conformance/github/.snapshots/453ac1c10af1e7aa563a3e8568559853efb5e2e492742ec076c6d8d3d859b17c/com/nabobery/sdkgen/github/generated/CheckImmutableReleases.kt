package com.nabobery.sdkgen.github.generated

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
 * Check immutable releases
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/check-immutable-releases
 */
@Serializable(with = CheckImmutableReleases.Serializer::class)
public class CheckImmutableReleases(
  /**
   * Whether immutable releases are enabled for the repository.
   */
  public val enabled: Boolean,
  /**
   * Whether immutable releases are enforced by the repository owner.
   */
  public val enforcedByOwner: Boolean,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    private var enforcedByOwnerValue: Boolean? = null

    public var enforcedByOwner: Boolean
      get() = requireNotNull(enforcedByOwnerValue) { "enforcedByOwner is required" }
      set(`value`) {
        enforcedByOwnerValue = value
      }

    public fun build(): CheckImmutableReleases {
      check(enabledValue != null) { "enabled is required" }
      check(enforcedByOwnerValue != null) { "enforcedByOwner is required" }
      return CheckImmutableReleases(
        enabled = enabled,
        enforcedByOwner = enforcedByOwner,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CheckImmutableReleases = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CheckImmutableReleases> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CheckImmutableReleases {
      val jsonDecoder = decoder.requireJsonDecoder("CheckImmutableReleases")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CheckImmutableReleases must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      val enforcedByOwner = json.decodeRequired<Boolean>(rawObject, "enforced_by_owner")
      return CheckImmutableReleases(
        enabled = enabled,
        enforcedByOwner = enforcedByOwner,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CheckImmutableReleases) {
      val jsonEncoder = encoder.requireJsonEncoder("CheckImmutableReleases")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        put("enforced_by_owner", json.encodeToJsonElement(value.enforcedByOwner))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun checkImmutableReleases(block: CheckImmutableReleases.Builder.() -> Unit): CheckImmutableReleases = CheckImmutableReleases.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CheckImmutableReleases is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
