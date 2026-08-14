package io.github.nabobery.sdkgen.generated.stripe

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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/connect_embedded_financial_account_transactions_config_claim
 */
@Serializable(with = ConnectEmbeddedFinancialAccountTransactionsConfigClaim.Serializer::class)
public class ConnectEmbeddedFinancialAccountTransactionsConfigClaim(
  /**
   * Whether the embedded component is enabled.
   */
  public val enabled: Boolean,
  public val features: ConnectEmbeddedFinancialAccountTransactionsFeatures,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    private var featuresValue: ConnectEmbeddedFinancialAccountTransactionsFeatures? = null

    public var features: ConnectEmbeddedFinancialAccountTransactionsFeatures
      get() = requireNotNull(featuresValue) { "features is required" }
      set(`value`) {
        featuresValue = value
      }

    public fun build(): ConnectEmbeddedFinancialAccountTransactionsConfigClaim {
      check(enabledValue != null) { "enabled is required" }
      check(featuresValue != null) { "features is required" }
      return ConnectEmbeddedFinancialAccountTransactionsConfigClaim(
        enabled = enabled,
        features = features,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ConnectEmbeddedFinancialAccountTransactionsConfigClaim = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ConnectEmbeddedFinancialAccountTransactionsConfigClaim> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ConnectEmbeddedFinancialAccountTransactionsConfigClaim {
      val jsonDecoder = decoder.requireJsonDecoder("ConnectEmbeddedFinancialAccountTransactionsConfigClaim")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ConnectEmbeddedFinancialAccountTransactionsConfigClaim must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      val features = json.decodeRequired<ConnectEmbeddedFinancialAccountTransactionsFeatures>(rawObject, "features")
      return ConnectEmbeddedFinancialAccountTransactionsConfigClaim(
        enabled = enabled,
        features = features,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ConnectEmbeddedFinancialAccountTransactionsConfigClaim) {
      val jsonEncoder = encoder.requireJsonEncoder("ConnectEmbeddedFinancialAccountTransactionsConfigClaim")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        put("features", json.encodeToJsonElement(value.features))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun connectEmbeddedFinancialAccountTransactionsConfigClaim(block: ConnectEmbeddedFinancialAccountTransactionsConfigClaim.Builder.() -> Unit): ConnectEmbeddedFinancialAccountTransactionsConfigClaim = ConnectEmbeddedFinancialAccountTransactionsConfigClaim.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ConnectEmbeddedFinancialAccountTransactionsConfigClaim is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
