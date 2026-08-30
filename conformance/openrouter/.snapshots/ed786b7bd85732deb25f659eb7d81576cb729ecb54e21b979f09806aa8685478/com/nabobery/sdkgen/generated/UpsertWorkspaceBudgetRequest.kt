package com.nabobery.sdkgen.generated

import kotlin.Double
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/UpsertWorkspaceBudgetRequest.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/UpsertWorkspaceBudgetRequest
 */
@Serializable(with = UpsertWorkspaceBudgetRequest.Serializer::class)
public class UpsertWorkspaceBudgetRequest(
  /**
   * Spending limit in USD. Must be greater than 0.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val limitUsd: Double,
) {
  public class Builder {
    private var limitUsdValue: Double? = null

    public var limitUsd: Double
      get() = requireNotNull(limitUsdValue) { "limitUsd is required" }
      set(`value`) {
        limitUsdValue = value
      }

    public fun build(): UpsertWorkspaceBudgetRequest {
      check(limitUsdValue != null) { "limitUsd is required" }
      return UpsertWorkspaceBudgetRequest(
        limitUsd = limitUsd,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): UpsertWorkspaceBudgetRequest = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<UpsertWorkspaceBudgetRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): UpsertWorkspaceBudgetRequest {
      val jsonDecoder = decoder.requireJsonDecoder("UpsertWorkspaceBudgetRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("UpsertWorkspaceBudgetRequest must be a JSON object")
      val limitUsd = json.decodeRequired<Double>(rawObject, "limit_usd")
      return UpsertWorkspaceBudgetRequest(
        limitUsd = limitUsd,
      )
    }

    override fun serialize(encoder: Encoder, `value`: UpsertWorkspaceBudgetRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("UpsertWorkspaceBudgetRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("limit_usd", json.encodeToJsonElement(value.limitUsd))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun upsertWorkspaceBudgetRequest(block: UpsertWorkspaceBudgetRequest.Builder.() -> Unit): UpsertWorkspaceBudgetRequest = UpsertWorkspaceBudgetRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("UpsertWorkspaceBudgetRequest is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
