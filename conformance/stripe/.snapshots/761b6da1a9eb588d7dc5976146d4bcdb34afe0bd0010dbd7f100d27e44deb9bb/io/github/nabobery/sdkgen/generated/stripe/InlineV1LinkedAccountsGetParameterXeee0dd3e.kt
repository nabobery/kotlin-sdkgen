package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.json#/paths/~1v1~1linked_accounts/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1linked_accounts/get/parameters/0/schema
 */
@Serializable(with = InlineV1LinkedAccountsGetParameterXeee0dd3e.Serializer::class)
public class InlineV1LinkedAccountsGetParameterXeee0dd3e(
  public val account: String? = null,
  public val customer: String? = null,
  public val customerAccount: String? = null,
) {
  public class Builder {
    public var account: String? = null

    public var customer: String? = null

    public var customerAccount: String? = null

    public fun build(): InlineV1LinkedAccountsGetParameterXeee0dd3e = InlineV1LinkedAccountsGetParameterXeee0dd3e(
      account = account,
      customer = customer,
      customerAccount = customerAccount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1LinkedAccountsGetParameterXeee0dd3e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1LinkedAccountsGetParameterXeee0dd3e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1LinkedAccountsGetParameterXeee0dd3e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1LinkedAccountsGetParameterXeee0dd3e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1LinkedAccountsGetParameterXeee0dd3e must be a JSON object")
      return InlineV1LinkedAccountsGetParameterXeee0dd3e(
        account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1LinkedAccountsGetParameterXeee0dd3e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1LinkedAccountsGetParameterXeee0dd3e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.account?.let { put("account", it) }
        value.customer?.let { put("customer", it) }
        value.customerAccount?.let { put("customer_account", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1LinkedAccountsGetParameterXeee0dd3e(block: InlineV1LinkedAccountsGetParameterXeee0dd3e.Builder.() -> Unit): InlineV1LinkedAccountsGetParameterXeee0dd3e = InlineV1LinkedAccountsGetParameterXeee0dd3e.build(block)
