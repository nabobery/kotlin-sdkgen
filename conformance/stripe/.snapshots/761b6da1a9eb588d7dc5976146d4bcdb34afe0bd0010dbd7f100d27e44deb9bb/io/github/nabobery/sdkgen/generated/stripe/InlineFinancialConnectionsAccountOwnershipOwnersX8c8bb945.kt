package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * A paginated list of owners for this account.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.account_ownership/properties/owners
 */
@Serializable(with = InlineFinancialConnectionsAccountOwnershipOwnersX8c8bb945.Serializer::class)
public class InlineFinancialConnectionsAccountOwnershipOwnersX8c8bb945(
  `data`: List<FinancialConnectionsAccountOwner>,
  /**
   * True if this list has another page of items after this one that can be fetched.
   */
  public val hasMore: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
   */
  public val objectValue: InlineFinancialConnectionsAccountOwnershipOwnersObjectValueX581c2112,
  /**
   * The URL where this list can be accessed.
   */
  public val url: String,
) {
  /**
   * Details about each object.
   */
  public val `data`: List<FinancialConnectionsAccountOwner> = data.toList()

  public class Builder {
    private var dataValue: List<FinancialConnectionsAccountOwner>? = null

    public var `data`: List<FinancialConnectionsAccountOwner>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    private var hasMoreValue: Boolean? = null

    public var hasMore: Boolean
      get() = requireNotNull(hasMoreValue) { "hasMore is required" }
      set(`value`) {
        hasMoreValue = value
      }

    private var objectValueValue:
        InlineFinancialConnectionsAccountOwnershipOwnersObjectValueX581c2112? = null

    public var objectValue: InlineFinancialConnectionsAccountOwnershipOwnersObjectValueX581c2112
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineFinancialConnectionsAccountOwnershipOwnersX8c8bb945 {
      check(dataValue != null) { "data is required" }
      check(hasMoreValue != null) { "hasMore is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(urlValue != null) { "url is required" }
      return InlineFinancialConnectionsAccountOwnershipOwnersX8c8bb945(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineFinancialConnectionsAccountOwnershipOwnersX8c8bb945 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineFinancialConnectionsAccountOwnershipOwnersX8c8bb945> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFinancialConnectionsAccountOwnershipOwnersX8c8bb945 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFinancialConnectionsAccountOwnershipOwnersX8c8bb945")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineFinancialConnectionsAccountOwnershipOwnersX8c8bb945 must be a JSON object")
      val data = json.decodeRequired<List<FinancialConnectionsAccountOwner>>(rawObject, "data")
      val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
      val objectValue = json.decodeRequired<InlineFinancialConnectionsAccountOwnershipOwnersObjectValueX581c2112>(rawObject, "object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineFinancialConnectionsAccountOwnershipOwnersX8c8bb945(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineFinancialConnectionsAccountOwnershipOwnersX8c8bb945) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineFinancialConnectionsAccountOwnershipOwnersX8c8bb945")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("has_more", json.encodeToJsonElement(value.hasMore))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineFinancialConnectionsAccountOwnershipOwnersX8c8bb945(block: InlineFinancialConnectionsAccountOwnershipOwnersX8c8bb945.Builder.() -> Unit): InlineFinancialConnectionsAccountOwnershipOwnersX8c8bb945 = InlineFinancialConnectionsAccountOwnershipOwnersX8c8bb945.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineFinancialConnectionsAccountOwnershipOwnersX8c8bb945 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
