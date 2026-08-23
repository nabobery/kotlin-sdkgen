package com.nabobery.sdkgen.generated

import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/RouterParams.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/RouterParams
 */
@Serializable(with = RouterParams.Serializer::class)
public class RouterParams(
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val qualityFloor: Double? = null,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val throughputFloor: Double? = null,
  public val versionGroup: String? = null,
  additionalProperties: Map<String, JsonElement> = emptyMap(),
) {
  /**
   * Additional JSON object members not declared as fixed properties.
   */
  public val additionalProperties: Map<String, JsonElement> =
      copyAndValidateRouterParamsAdditionalProperties(additionalProperties)

  public class Builder {
    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var qualityFloor: Double? = null

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var throughputFloor: Double? = null

    public var versionGroup: String? = null

    private var additionalPropertiesValue: Map<String, JsonElement> = emptyMap()

    /**
     * Additional JSON object members not declared as fixed properties.
     */
    public var additionalProperties: Map<String, JsonElement>
      get() = additionalPropertiesValue.toMap()
      set(`value`) {
        additionalPropertiesValue = value.toMap()
      }

    public fun build(): RouterParams = RouterParams(
      qualityFloor = qualityFloor,
      throughputFloor = throughputFloor,
      versionGroup = versionGroup,
      additionalProperties = additionalProperties,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RouterParams = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RouterParams> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RouterParams {
      val jsonDecoder = decoder.requireJsonDecoder("RouterParams")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RouterParams must be a JSON object")
      return RouterParams(
        qualityFloor = rawObject["quality_floor"]?.let { json.decodeFromJsonElement<Double>(it) },
        throughputFloor = rawObject["throughput_floor"]?.let { json.decodeFromJsonElement<Double>(it) },
        versionGroup = rawObject["version_group"]?.let { json.decodeFromJsonElement<String>(it) },
        additionalProperties = rawObject.filterKeys { key -> key !in setOf("quality_floor", "throughput_floor", "version_group") }.mapValues { (_, element) -> element }.toMap(),
      )
    }

    override fun serialize(encoder: Encoder, `value`: RouterParams) {
      val jsonEncoder = encoder.requireJsonEncoder("RouterParams")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.qualityFloor?.let { put("quality_floor", json.encodeToJsonElement(it)) }
        value.throughputFloor?.let { put("throughput_floor", json.encodeToJsonElement(it)) }
        value.versionGroup?.let { put("version_group", it) }
        value.additionalProperties.keys.sorted().forEach { key ->
          val additionalValue = value.additionalProperties.getValue(key)
          check(key !in setOf("quality_floor", "throughput_floor", "version_group")) { "RouterParams additionalProperties key '" + key + "' collides with a fixed property" }
          put(key, additionalValue)
        }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

private fun copyAndValidateRouterParamsAdditionalProperties(additionalProperties: Map<String, JsonElement>): Map<String, JsonElement> {
  val copied = additionalProperties.toMap()
  val collision = copied.keys.sorted().firstOrNull { key -> key in setOf("quality_floor", "throughput_floor", "version_group") }
  require(collision == null) { "RouterParams additionalProperties key '" + collision + "' collides with a fixed property" }
  return copied
}

public fun routerParams(block: RouterParams.Builder.() -> Unit): RouterParams = RouterParams.build(block)
